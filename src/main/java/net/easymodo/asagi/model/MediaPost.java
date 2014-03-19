package net.easymodo.asagi.model;

public class MediaPost {
    private final int num;
    private final int threadNum;
    private final boolean op;
    private final String preview;
    private final String media;
    private final String mediaHash;
    private final String mediaFilename;
    private final String mediaExt;

    public MediaPost(int num, int tnum, boolean op, String preview, String media, String mediaHash, String mediaFilename, String mediaExt) {
        this.num = num;
        this.threadNum = tnum;
        this.op = op;
        this.preview = preview;
        this.media = media;
        this.mediaHash = mediaHash;
        this.mediaFilename = mediaFilename;
        this.mediaExt = mediaExt;
    }

    public int getNum() {
        return num;
    }

    public int getThreadNum() {
        return threadNum;
    }

    public String getPreview() {
        return preview;
    }

    public String getMedia() {
        return media;
    }

    public String getMediaHash() {
        return mediaHash;
    }

    public String getMediaFilename() {
        return mediaFilename;
    }

    public String getMediaExt() {
        return mediaExt;
    }

    public boolean isOp() {
        return op;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediaPost mediaPost = (MediaPost) o;

        return mediaHash.equals(mediaPost.mediaHash);
    }

    @Override
    public int hashCode() {
        return mediaHash.hashCode();
    }
}
