package com.company;

import java.util.*;

class News
{
    int NewsId;
    String Postbyuser;
    String Commentbyuser;
   String comment;

   public News(int newsId, String postbyuser, String commentbyuser, String comment) {
        NewsId = newsId;
        Postbyuser = postbyuser;
        Commentbyuser = commentbyuser;
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public int getNewsId() {
        return NewsId;
    }

    public void setNewsId(int newsId) {
        NewsId = newsId;
    }

    public String getPostbyuser() {
        return Postbyuser;
    }

    public void setPostbyuser(String postbyuser) {
        Postbyuser = postbyuser;
    }

    public String getCommentbyuser() {
        return Commentbyuser;
    }

    public void setCommentbyuser(String commentbyuser) {
        Commentbyuser = commentbyuser;
    }


    @Override
    public String toString() {
        return "News{" +
                "NewsId=" + NewsId +
                ", Postbyuser='" + Postbyuser + '\'' +
                ", Commentbyuser='" + Commentbyuser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

public class NewsAssignment
{
    public static void main(String[] args)
    {
        News s1=new News(1,"sushma","srimanya","budget");
        News s2=new News(2,"srimanya","sushma","good");
        News s3=new News(3,"sushma","poojitha","excellent");
        News s4=new News(4,"poojitha","prathyusha","Stunning");




        ArrayList<News> l1=new ArrayList<>();
        {
            l1.add(s1);
            l1.add(s2);
            l1.add(s3);
            l1.add(s4);
            System.out.println(l1);

        }
      //  Optional<News> sortedlist9=l1.stream().map(Comparator.comparing(News::getComment::getName));
      //  System.out.println(sortedlist9);
      long count=  l1.stream().filter(p->p.getComment().equals("budget")).count();
      System.out.println(count);


    }
}
