package com.proartz.Chapter6.Exercise14;

public class ThrowingCloseable extends SoCloseable {

    private boolean closed = false;

    @Override
    public void close() throws Exception {
        throw new Exception("Unable to close resource.");
    }

    public boolean isClosed() {
        return closed;
    }
}