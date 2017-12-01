// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: Common.capnp

package me.defenestration.ericsson.connection.protocol;

public final class CommonClass {
    public enum Direction {
        UP(0),
        LEFT(1),
        DOWN(2),
        RIGHT(3),
        _NOT_IN_SCHEMA(4);

        public static Direction[] lookup = new Direction[] { UP, LEFT, DOWN, RIGHT, _NOT_IN_SCHEMA };
        private int id;

        Direction(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return this.id + "";
        }

        public static Direction parse(int i) {
            return lookup[i];
        }
    }

    public static class Position {
        public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 1, (short) 0);

        public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
            public Factory() {
            }

            public final Reader constructReader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                return new Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                return new Builder(segment, data, pointers, dataSize, pointerCount);
            }

            public final org.capnproto.StructSize structSize() {
                return Position.STRUCT_SIZE;
            }

            public final Reader asReader(Builder builder) {
                return builder.asReader();
            }
        }

        public static final Factory factory = new Factory();
        public static final org.capnproto.StructList.Factory<Builder, Reader> listFactory =
                new org.capnproto.StructList.Factory<Builder, Reader>(factory);

        public static final class Builder extends org.capnproto.StructBuilder {
            Builder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                super(segment, data, pointers, dataSize, pointerCount);
            }

            public final Reader asReader() {
                return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
            }

            public final int getX() {
                return _getIntField(0);
            }

            public final void setX(int value) {
                _setIntField(0, value);
            }

            public final int getY() {
                return _getIntField(1);
            }

            public final void setY(int value) {
                _setIntField(1, value);
            }

        }

        public static final class Reader extends org.capnproto.StructReader {
            Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public final int getX() {
                return _getIntField(0);
            }

            public final int getY() {
                return _getIntField(1);
            }

        }

    }


    public static final class Schemas {
        public static final org.capnproto.SegmentReader b_9aa647d8c3b70d99 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u0099\r\u00b7\u00c3\u00d8\u0047\u00a6\u009a" +
                                "\r\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
                                "\u0025\u006a\u00e6\u0077\u0067\u007c\u0089\u00f0" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u00ba\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u0067\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u006f\u006e\u002e\u0063" +
                                "\u0061\u0070\u006e\u0070\u003a\u0044\u0069\u0072" +
                                "\u0065\u0063\u0074\u0069\u006f\u006e\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0010\u0000\u0000\u0000\u0001\u0000\u0002\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0029\u0000\u0000\u0000\u001a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0021\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0011\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0075\u0070\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u006c\u0065\u0066\u0074\u0000\u0000\u0000\u0000" +
                                "\u0064\u006f\u0077\u006e\u0000\u0000\u0000\u0000" +
                                "\u0072\u0069\u0067\u0068\u0074\u0000\u0000\u0000" + "");
        public static final org.capnproto.SegmentReader b_eca0183b0ddb2bb3 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u00b3\u002b\u00db\r\u003b\u0018\u00a0\u00ec" +
                                "\r\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0025\u006a\u00e6\u0077\u0067\u007c\u0089\u00f0" +
                                "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u00b2\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u006f\u006e\u002e\u0063" +
                                "\u0061\u0070\u006e\u0070\u003a\u0050\u006f\u0073" +
                                "\u0069\u0074\u0069\u006f\u006e\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0029\u0000\u0000\u0000\u0012\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u002d\u0000\u0000\u0000\u0012\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0028\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0034\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0078\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0079\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
    }
}

