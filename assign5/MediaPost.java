class MediaPost{
    void post(){
        System.out.println("Posting the media post..");
    }

    void comment(){
        System.out.println("Commenting the social media post");
    }

}

class TextPost extends MediaPost{
    @Override
    void post(){
        System.out.println("Posting the text");
    }
    void comment(){
        System.out.println("Commenting on text post");
    }
}
class ImagePost extends MediaPost{
    void post(){
        System.out.println("Posting the image");
    }
    void comment(){
        System.out.println("Commenting on the image post");
    }
}