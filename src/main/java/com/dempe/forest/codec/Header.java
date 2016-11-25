package com.dempe.forest.codec;

/**
 * 0-15	16-23	24-31	32-95	96-127
 magic	version	extend flag	request id	body content length
 魔数	协议版本	24-28	29-30	31
 消息id

 body包长
 保留	event( 可支持4种event，
 如normal, exception等)	0 is request , 1 is response

 * User: Dempe
 * Date: 2016/11/25
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class Header{

    private short magic;
    private Byte version;
    private Byte extend;
    private Long messageID;
    private Integer size;

    public short getMagic() {
        return magic;
    }

    public void setMagic(short magic) {
        this.magic = magic;
    }

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    public Byte getExtend() {
        return extend;
    }

    public void setExtend(Byte extend) {
        this.extend = extend;
    }

    public Long getMessageID() {
        return messageID;
    }

    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}