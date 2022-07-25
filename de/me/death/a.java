// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataInput;
import java.io.InputStream;

public class a extends InputStream implements DataInput
{
    public int a;
    private DataInputStream b;
    private ByteArrayInputStream c;
    
    public a(final byte[] buf, final int a) {
        this.c = new ByteArrayInputStream(buf);
        this.b = new DataInputStream(this.c);
        this.a = a;
    }
    
    public a(final byte[] buf) {
        this.c = new ByteArrayInputStream(buf);
        this.b = new DataInputStream(this.c);
    }
    
    @Override
    public int available() {
        return this.b.available();
    }
    
    @Override
    public void close() {
        this.b.close();
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.b.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public void mark(final int readlimit) {
        this.b.mark(readlimit);
    }
    
    @Override
    public boolean markSupported() {
        return this.b.markSupported();
    }
    
    @Override
    public int read() {
        return this.b.read();
    }
    
    @Override
    public final int read(final byte[] b, final int off, final int len) {
        return this.b.read(b, off, len);
    }
    
    @Override
    public final int read(final byte[] b) {
        return this.b.read(b);
    }
    
    @Override
    public final boolean readBoolean() {
        return this.b.readBoolean();
    }
    
    @Override
    public final byte readByte() {
        return this.b.readByte();
    }
    
    @Override
    public final char readChar() {
        return this.b.readChar();
    }
    
    @Override
    public final double readDouble() {
        return this.b.readDouble();
    }
    
    @Override
    public final float readFloat() {
        return this.b.readFloat();
    }
    
    @Override
    public final void readFully(final byte[] b, final int off, final int len) {
        this.b.readFully(b, off, len);
    }
    
    @Override
    public final void readFully(final byte[] b) {
        this.b.readFully(b);
    }
    
    @Override
    public final int readInt() {
        return this.b.readInt();
    }
    
    @Override
    public final String readLine() {
        return this.b.readLine();
    }
    
    @Override
    public final long readLong() {
        return this.b.readLong();
    }
    
    @Override
    public final short readShort() {
        return this.b.readShort();
    }
    
    @Override
    public final String readUTF() {
        return this.b.readUTF();
    }
    
    @Override
    public final int readUnsignedByte() {
        return this.b.readUnsignedByte();
    }
    
    @Override
    public final int readUnsignedShort() {
        return this.b.readUnsignedShort();
    }
    
    @Override
    public void reset() {
        this.b.reset();
    }
    
    @Override
    public long skip(final long n) {
        return this.b.skip(n);
    }
    
    @Override
    public final int skipBytes(final int n) {
        return this.b.skipBytes(n);
    }
    
    @Override
    public String toString() {
        return this.b.toString();
    }
}
