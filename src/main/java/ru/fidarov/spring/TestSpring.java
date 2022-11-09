package ru.fidarov.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();

        //создали бин классической музыки
        //Music music = context.getBean("player",Music.class);
        //создали бин рок музыки
        //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer thirdPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//
//        boolean comp = firstMusicPlayer == secondMusicPlayer;
//        ClassicalMusic classicalMusic = context.getBean("classical",ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());
//        System.out.println(comp);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println(thirdPlayer);
//
//        firstMusicPlayer.setVolume(44);
//        thirdPlayer.setVolume(4);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        System.out.println(thirdPlayer.getVolume());


        //System.out.println(musicPlayer.getMusicList());
    }
}
