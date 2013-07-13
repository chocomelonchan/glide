package com.bumptech.glide.resize.cache;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: sam
 * Date: 6/5/13
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
public interface DiskCache {
    public interface Writer {
        public void write(OutputStream os);
    }

    public InputStream get(String key);
    public void put(String key, Writer writer);
    public void delete(String key);
}
