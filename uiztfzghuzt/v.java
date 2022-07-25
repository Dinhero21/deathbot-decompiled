// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;

class v implements t
{
    final DataOutput a;
    final ByteArrayOutputStream b;
    
    v(final ByteArrayOutputStream byteArrayOutputStream) {
        int b = u.b;
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
        if (nb.a) {
            u.b = ++b;
        }
    }
    
    @Override
    public void write(final int n) {
        try {
            this.a.write(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void write(final byte[] array) {
        try {
            this.a.write(array);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        try {
            this.a.write(array, n, n2);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeBoolean(final boolean b) {
        try {
            this.a.writeBoolean(b);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeByte(final int n) {
        try {
            this.a.writeByte(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeBytes(final String s) {
        try {
            this.a.writeBytes(s);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeChar(final int n) {
        try {
            this.a.writeChar(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeChars(final String s) {
        try {
            this.a.writeChars(s);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeDouble(final double n) {
        try {
            this.a.writeDouble(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeFloat(final float n) {
        try {
            this.a.writeFloat(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeInt(final int n) {
        try {
            this.a.writeInt(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeLong(final long n) {
        try {
            this.a.writeLong(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeShort(final int n) {
        try {
            this.a.writeShort(n);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public void writeUTF(final String s) {
        try {
            this.a.writeUTF(s);
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public byte[] a() {
        return this.b.toByteArray();
    }
}
