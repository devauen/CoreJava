package com.proartz.Chapter6.Exercise14;

public class ThrowingCloseable extends SoCloseable {

    private static final String DEFAULT_MESSAGE = "Unable to close.";
    private boolean closed = false;
    private String message;

    public ThrowingCloseable() {
        super();
        this.message = DEFAULT_MESSAGE;
    }

    public ThrowingCloseable(String message) {
        super();
        this.message = message;
    }

    @Override
    public void close() throws Exception{
        throw new Exception(message);
    }

    public boolean isClosed() {
        return closed;
    }
}