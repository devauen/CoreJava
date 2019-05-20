package com.proartz.Chapter6.Exercise14;

public class SoCloseable implements AutoCloseable{

    private boolean closed = false;

    @Override
    public void close() throws Exception {
        this.closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}