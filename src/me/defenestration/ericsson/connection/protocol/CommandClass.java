// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: Command.capnp

package me.defenestration.ericsson.connection.protocol;

public final class CommandClass {
    public static class Move {
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
                return Move.STRUCT_SIZE;
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

            public final int getUnit() {
                return _getIntField(0);
            }

            public final void setUnit(int value) {
                _setIntField(0, value);
            }

            public final CommonClass.Direction getDirection() {
                switch (_getShortField(2)) {
                    case 0:
                        return CommonClass.Direction.UP;
                    case 1:
                        return CommonClass.Direction.LEFT;
                    case 2:
                        return CommonClass.Direction.DOWN;
                    case 3:
                        return CommonClass.Direction.RIGHT;
                    default:
                        return CommonClass.Direction._NOT_IN_SCHEMA;
                }
            }

            public final void setDirection(CommonClass.Direction value) {
                _setShortField(2, (short) value.ordinal());
            }

        }

        public static final class Reader extends org.capnproto.StructReader {
            Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public final int getUnit() {
                return _getIntField(0);
            }

            public final CommonClass.Direction getDirection() {
                switch (_getShortField(2)) {
                    case 0:
                        return CommonClass.Direction.UP;
                    case 1:
                        return CommonClass.Direction.LEFT;
                    case 2:
                        return CommonClass.Direction.DOWN;
                    case 3:
                        return CommonClass.Direction.RIGHT;
                    default:
                        return CommonClass.Direction._NOT_IN_SCHEMA;
                }
            }

        }

    }


    public static class Command {
        public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 1, (short) 2);

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
                return Command.STRUCT_SIZE;
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

            public final Commands.Builder getCommands() {
                return new Command.Commands.Builder(segment, data, pointers, dataSize, pointerCount);
            }

            public final Commands.Builder initCommands() {
                _setShortField(0, (short) 0);
                _clearPointerField(0);
                _clearPointerField(1);
                return new Command.Commands.Builder(segment, data, pointers, dataSize, pointerCount);
            }

        }

        public static final class Reader extends org.capnproto.StructReader {
            Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public Commands.Reader getCommands() {
                return new Command.Commands.Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

        }

        public static class Commands {
            public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 1, (short) 2);

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
                    return Command.Commands.STRUCT_SIZE;
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

                public Which which() {
                    switch (_getShortField(0)) {
                        case 0:
                            return Which.MOVES;
                        case 1:
                            return Which.LOGIN;
                        default:
                            return Which._NOT_IN_SCHEMA;
                    }
                }

                public final Reader asReader() {
                    return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
                }

                public final boolean isMoves() {
                    return which() == Command.Commands.Which.MOVES;
                }

                public final boolean hasMoves() {
                    return !_pointerFieldIsNull(0);
                }

                public final org.capnproto.StructList.Builder<CommandClass.Move.Builder> getMoves() {
                    return _getPointerField(CommandClass.Move.listFactory, 0, null, 0);
                }

                public final void setMoves(org.capnproto.StructList.Reader<CommandClass.Move.Reader> value) {
                    _setPointerField(CommandClass.Move.listFactory, 0, value);
                }

                public final org.capnproto.StructList.Builder<CommandClass.Move.Builder> initMoves(int size) {
                    return _initPointerField(CommandClass.Move.listFactory, 0, size);
                }

                public final boolean isLogin() {
                    return which() == Command.Commands.Which.LOGIN;
                }

                public final Login.Builder getLogin() {
                    return new Command.Commands.Login.Builder(segment, data, pointers, dataSize, pointerCount);
                }

                public final Login.Builder initLogin() {
                    _setShortField(0, (short) Command.Commands.Which.LOGIN.ordinal());
                    _clearPointerField(0);
                    _clearPointerField(1);
                    return new Command.Commands.Login.Builder(segment, data, pointers, dataSize, pointerCount);
                }

            }

            public static final class Reader extends org.capnproto.StructReader {
                Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                    super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
                }

                public Which which() {
                    switch (_getShortField(0)) {
                        case 0:
                            return Which.MOVES;
                        case 1:
                            return Which.LOGIN;
                        default:
                            return Which._NOT_IN_SCHEMA;
                    }
                }

                public final boolean isMoves() {
                    return which() == Command.Commands.Which.MOVES;
                }

                public final boolean hasMoves() {
                    return !_pointerFieldIsNull(0);
                }

                public final org.capnproto.StructList.Reader<CommandClass.Move.Reader> getMoves() {
                    return _getPointerField(CommandClass.Move.listFactory, 0, null, 0);
                }

                public final boolean isLogin() {
                    return which() == Command.Commands.Which.LOGIN;
                }

                public Login.Reader getLogin() {
                    return new Command.Commands.Login.Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
                }

            }

            public enum Which {
                MOVES,
                LOGIN,
                _NOT_IN_SCHEMA,
            }

            public static class Login {
                public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 1, (short) 2);

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
                        return Command.Commands.Login.STRUCT_SIZE;
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

                    public final boolean hasTeam() {
                        return !_pointerFieldIsNull(0);
                    }

                    public final org.capnproto.Text.Builder getTeam() {
                        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
                    }

                    public final void setTeam(org.capnproto.Text.Reader value) {
                        _setPointerField(org.capnproto.Text.factory, 0, value);
                    }

                    public final void setTeam(String value) {
                        _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
                    }

                    public final org.capnproto.Text.Builder initTeam(int size) {
                        return _initPointerField(org.capnproto.Text.factory, 0, size);
                    }

                    public final boolean hasHash() {
                        return !_pointerFieldIsNull(1);
                    }

                    public final org.capnproto.Text.Builder getHash() {
                        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
                    }

                    public final void setHash(org.capnproto.Text.Reader value) {
                        _setPointerField(org.capnproto.Text.factory, 1, value);
                    }

                    public final void setHash(String value) {
                        _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
                    }

                    public final org.capnproto.Text.Builder initHash(int size) {
                        return _initPointerField(org.capnproto.Text.factory, 1, size);
                    }
                }

                public static final class Reader extends org.capnproto.StructReader {
                    Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
                    }

                    public boolean hasTeam() {
                        return !_pointerFieldIsNull(0);
                    }

                    public org.capnproto.Text.Reader getTeam() {
                        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
                    }

                    public boolean hasHash() {
                        return !_pointerFieldIsNull(1);
                    }

                    public org.capnproto.Text.Reader getHash() {
                        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
                    }

                }

            }


        }


    }


    public static final class Schemas {
        public static final org.capnproto.SegmentReader b_ac5e264a1547dce3 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u00e3\u00dc\u0047\u0015\u004a\u0026\u005e\u00ac" +
                                "\u000e\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0023\u00a9\u004f\u0055\u003c\u00f5\u00f8\u00ab" +
                                "\u0000\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u009a\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u0061\u006e\u0064\u002e" +
                                "\u0063\u0061\u0070\u006e\u0070\u003a\u004d\u006f" +
                                "\u0076\u0065\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0029\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u002d\u0000\u0000\u0000\u0052\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u002c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0038\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0075\u006e\u0069\u0074\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0064\u0069\u0072\u0065\u0063\u0074\u0069\u006f" +
                                "\u006e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0099\r\u00b7\u00c3\u00d8\u0047\u00a6\u009a" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
        public static final org.capnproto.SegmentReader b_c0b4b2c3dfb664f2 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u00f2\u0064\u00b6\u00df\u00c3\u00b2\u00b4\u00c0" +
                                "\u000e\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0023\u00a9\u004f\u0055\u003c\u00f5\u00f8\u00ab" +
                                "\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u00b2\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u003f\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u0061\u006e\u0064\u002e" +
                                "\u0063\u0061\u0070\u006e\u0070\u003a\u0043\u006f" +
                                "\u006d\u006d\u0061\u006e\u0064\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u009e\u0020\u001d\u0025\u00c0\u00b1\u0027\u00a0" +
                                "\r\u0000\u0000\u0000\u004a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0063\u006f\u006d\u006d\u0061\u006e\u0064\u0073" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
        public static final org.capnproto.SegmentReader b_a027b1c0251d209e =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u009e\u0020\u001d\u0025\u00c0\u00b1\u0027\u00a0" +
                                "\u0016\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u00f2\u0064\u00b6\u00df\u00c3\u00b2\u00b4\u00c0" +
                                "\u0002\u0000\u0007\u0000\u0001\u0000\u0002\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u00fa\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u0061\u006e\u0064\u002e" +
                                "\u0063\u0061\u0070\u006e\u0070\u003a\u0043\u006f" +
                                "\u006d\u006d\u0061\u006e\u0064\u002e\u0063\u006f" +
                                "\u006d\u006d\u0061\u006e\u0064\u0073\u0000\u0000" +
                                "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0029\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0040\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000" +
                                "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u005a\u00bc\u00fd\u00a5\u0070\u00a1\u0069\u009d" +
                                "\u003d\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u006d\u006f\u0076\u0065\u0073\u0000\u0000\u0000" +
                                "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u00e3\u00dc\u0047\u0015\u004a\u0026\u005e\u00ac" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u006c\u006f\u0067\u0069\u006e\u0000\u0000\u0000" + "");
        public static final org.capnproto.SegmentReader b_9d69a170a5fdbc5a =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u005a\u00bc\u00fd\u00a5\u0070\u00a1\u0069\u009d" +
                                "\u001f\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u009e\u0020\u001d\u0025\u00c0\u00b1\u0027\u00a0" +
                                "\u0002\u0000\u0007\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u002a\u0001\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0043\u006f\u006d\u006d\u0061\u006e\u0064\u002e" +
                                "\u0063\u0061\u0070\u006e\u0070\u003a\u0043\u006f" +
                                "\u006d\u006d\u0061\u006e\u0064\u002e\u0063\u006f" +
                                "\u006d\u006d\u0061\u006e\u0064\u0073\u002e\u006c" +
                                "\u006f\u0067\u0069\u006e\u0000\u0000\u0000\u0000" +
                                "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0029\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u002d\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0028\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0034\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0074\u0065\u0061\u006d\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0068\u0061\u0073\u0068\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
    }
}

