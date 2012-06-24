package fr.mildlyusefulsoftware.omgponies.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14fe5f0613a4c7";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{"http://www.horse-games-for-kids.com/images/homepagephoto.jpg",
				"http://www.horsebreedsinfo.com/images/brown_horse.jpg",
				"http://images2.fanpop.com/images/photos/5000000/Pony-and-Foal-ponies-5018803-550-377.jpg",
				"http://www.hedweb.com/animimag/horse-beach.jpg",
				"http://my10online.com/wp-content/uploads/2011/09/Shetland-Ponies-3.jpg",
				"http://www.historyforkids.org/learn/greeks/religion/pictures/horse.jpg",
				"http://static.guim.co.uk/sys-images/Books/Pix/pictures/2009/4/9/1239273491815/Shetland-ponies-002.jpg",
				"http://www.images-fonds.com/modules/mg3/albums/Animaux/Chevaux/rising-horse-wallpapers_12851_1024x768[1].jpg",
				"http://3.bp.blogspot.com/-I5yBSTAP0Fs/T5uArRBS4II/AAAAAAAAAJs/g3sCCSU2Fgc/s1600/39049_rozas_ponies!.jpg",
				"http://www.akfentertainment.com/akfpic/akfhors2.jpg",
				"http://horsebreedslist.com/horse_breed_images/84/big/shetland-pony-picture-1.jpg",
				"http://www.horsesden.com/pics/arabian-horse8.jpg",
				"http://4.bp.blogspot.com/-iPToWVbcoR0/T0v8kamOGNI/AAAAAAAAC5M/zCBptniU-Oc/s1600/pony_with_long_hair_portrait_wallpaper-336x336.jpg",
				"http://4.bp.blogspot.com/-WHmsVkLVk6g/TbaijDfBHsI/AAAAAAAAK1E/7j0rDrTST-Y/s1600/black-horse-black_horse.jpg",
				"http://www.popartuk.com/g/l/lgwiz01505+two-ponies-shetland-pony-and-foal-poster.jpg",
				"http://www.dogbreedinfo.com/images18/HorseJackField.JPG",
				"http://www.alternativevet.org/images/pony1.jpg",
				"http://www.images-fonds.com/modules/mg3/albums/Animaux/Chevaux/Beautiful_White_Horse.jpg",
				"http://mrsdubai.files.wordpress.com/2010/05/shetland-pony-0016.jpg",
				"http://www.bergoiata.org/fe/horses/Horse%20Jalu%20-%20Shire.jpg",
				"http://images4.fanpop.com/image/photos/23500000/horse-horses-23582505-1024-768.jpg",
				"http://desktopwallpaper-s.com/r?12",
				"http://www.anotherurl.com/travel/lundy/images/ponies.jpg",
				"http://izzyanimalworld.files.wordpress.com/2011/12/haflinger_horse.jpg",
				"http://lovehorseracing.net/wp-content/uploads/2012/02/Horse-Racing3.jpg",
				"http://www.timetowander.com/wp-content/uploads/2012/06/Horses.jpg",
				"http://www.zastavki.com/pictures/1024x768/2010/Animals_Horses_Horse_natural_grace_021307_.jpg",
				"http://horsetrailerworld.org/wp-content/uploads/2011/11/vitamins-for-horse.jpg",
				"http://www.zmescience.com/wp-content/uploads/2012/05/20090306_horse.jpg",
				"http://3.bp.blogspot.com/-gd9jQYBi1Ns/Ty1fKf7NwEI/AAAAAAAAFFw/QEwLxhXSBd8/s1600/running_horse1.jpg",
				"http://3.bp.blogspot.com/_EzNdwBJbaeg/TQPCNWbM3rI/AAAAAAAAAVE/p1JRuGhbJrw/s1600/Horse%252BApendix%25252C%252BQuarter%252BHorse.jpg",
				"http://www.evans-welshponies.com/images/steffan_2008_sport%20_pony_colt.jpg",
				"http://m.gmgrd.co.uk/sbres/328.$plit/C_67_article_2071912_body_articleblock_0_bodyimage.jpg?28%2F05%2F2010%2014%3A04%3A09%3A539",
				"http://www.mountjoystables.com/userimages/Holly2.jpg",
				"http://www.modelhorsegallery.info/J/Julip/JUL189.jpg",
				"http://www.devonponies.co.uk/gallery/ponypix/pony-tails.jpg",
				"http://farm1.static.flickr.com/202/509900312_9dcae9e67d.jpg",
				"http://appalacheeponies.com/ponies%207-22-2006%20005.jpg",
				"http://www.fxdirectory.info/wp-content/uploads/2012/01/The-Fell-pony-is-a-close-relative-of-the-Dales.jpg",
				"http://www.stonymeadowequestrian.com/yahoo_site_admin/assets/images/IMG_0096_2.19665002_std.JPG",
				"http://7and1.net/wp/wp-content/uploads/2011/11/pony.jpg",
				"http://media.tumblr.com/tumblr_lnq2u1IkU81qaz51t.jpg",
				"http://purchon.co.uk/wordpress/wp-content/uploads/beau1.jpg",
				"http://www.selfcateringshetland.co.uk/plugins/spaw2/uploads/images/Shetland%20Ponies%20Brindister%205%20minutes%20from%20Brekka%20Lodge%204%20Star%20Self%20Catering%20Shetlands.JPG",
				"http://horsebreedslist.com/horse_breed_images/94/big/welsh-pony-picture-5.jpg",
				"http://4.bp.blogspot.com/_uTks-IRCWFQ/TFEM1_h9EZI/AAAAAAAAAAs/8kzPOzrcCtQ/s1600/2ponies-1.jpg",
				"http://www.cornerways-shetlands.co.uk/userimages/blueberrybb1day.jpg",
				"http://animal-world.com/horses/Pony-Breeds/images/ShetlandPonyWPP_AcUwPCc.jpg",
				"http://www.highlandponies.com/Highlandpony15.jpg"
		
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("omgponies",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
