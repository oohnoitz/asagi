package net.easymodo.asagi.model.vichan;

@SuppressWarnings("UnusedDeclaration")
public class TopicJson {
    private net.easymodo.asagi.model.vichan.PostJson[] posts;

    public net.easymodo.asagi.model.vichan.PostJson[] getPosts() {
        return posts;
    }

    public void setPosts(PostJson[] posts) {
        this.posts = posts;
    }
}

