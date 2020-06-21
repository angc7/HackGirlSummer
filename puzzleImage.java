/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzlevr;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author angelac
 */
public class puzzleImage {
    URL image;
    String vrLink;
    
    public puzzleImage(int type) {
        switch (type) {
  case 1:
     try
        {
            image= new URL( "https://kids.nationalgeographic.com/explore/monuments/eiffel-tower/_jcr_content/content/textimage_6.img.jpg/1581608715365.jpg" );
        }
        catch ( MalformedURLException e1 )
        {
            e1.printStackTrace();
        }
     vrLink="https://irradiated-skillful-magnosaurus.glitch.me/";
    break;
  case 2:
    try
        {
           image= new URL(
                    "https://www.slc.gov/fire/wp-content/uploads/sites/47/2018/11/fireworks.jpg" );
        }
        catch ( MalformedURLException e1 )
        {
            e1.printStackTrace();
        }
    vrLink="https://glitter-chisel-mallow.glitch.me";
    break;
  case 3:
      try {
          image = new URL(
                 "https://dynaimage.cdn.cnn.com/cnn/w_1200/http%3A%2F%2Fcdn.cnn.com%2Fcnnnext%2Fdam%2Fassets%2F181010131059-australia-best-beaches-cossies-beach-cocos3-super-tease.jpg");
      } catch (MalformedURLException e1) {
          e1.printStackTrace();
      }
      vrLink="https://pickled-sage-key.glitch.me";
    break;
  case 4:
    try
        {
            image = new URL(
                    "https://fb.ru/media/i/3/7/8/4/4/4/i/378444.jpg" );

        }
        catch ( MalformedURLException e1 )
        {
            e1.printStackTrace();
        }
    vrLink="https://phase-early-find.glitch.me/";
    break;
  case 5:
    try
        {
            image = new URL(
                    "https://clevertravel.com.ua/wp-content/uploads/2016/04/3.sagrada-familia-1024x768.jpg\n" );

        }
        catch ( MalformedURLException e1 )
        {
            e1.printStackTrace();
        }
    vrLink="https://deadpan-fascinated-occupation.glitch.me/";
    break;
        }
}
}
