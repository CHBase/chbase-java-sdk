package com.chbase.thing.oxm.jaxb.thing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BlobStreamer {
	private String blobRefUrl = null;
	private String contentType = null;

	public BlobStreamer(String blobRefUrl, String contentType) {
		this.blobRefUrl = blobRefUrl;
		this.contentType = contentType;

	}

	public void streamBlobToUrl(byte[] data, int offset, int count, boolean isUploadComplete) throws IOException {
		long length = data.length;
		HttpURLConnection conn = null;
		DataOutputStream dos = null;

		URL url = new URL(this.blobRefUrl);
		conn = (HttpURLConnection) url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", this.contentType);
		conn.setRequestProperty("Content-Length", String.valueOf(length));
		conn.setRequestProperty("Content-Range", "bytes " + offset + "-" + (offset + length - 1) + "/*");
		if (isUploadComplete) {
			conn.setRequestProperty("x-hv-blob-complete", "1");
		}
		dos = new DataOutputStream(conn.getOutputStream());
		dos.write(data);
		dos.flush();
		dos.close();

		DataInputStream inStream = new DataInputStream(conn.getInputStream());
		while ((inStream.readLine()) != null) {

		}
		inStream.close();
	}
}
