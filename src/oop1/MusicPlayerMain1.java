package oop1;

public class MusicPlayerMain1 {
    static void main() {
        Music music = createMusic();
        turnOn(music);
        volumeUp(music);
        volumeUp(music);
        volumeDown(music);
        checkStatus(music);
        turnOff(music);
    }

    static Music createMusic() {
        Music music = new Music();
        music.volume = 0;
        music.isOn = false;
        return music;
    }

    static void turnOn(Music music){
        music.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void turnOff(Music music) {
        music.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(Music music) {
        music.volume += 1;
        System.out.println("음악 플레이어 볼륨:" + music.volume);
    }

    static void volumeDown(Music music) {
        music.volume -= 1;
        System.out.println("음악 플레이어 볼륨:" + music.volume);
    }

    static void checkStatus(Music music) {
        String playerOnOff = music.isOn ? "ON" : "OFF";
        System.out.println("음악 플레이어 상태 확인");
        System.out.println("음악 플레이어 " + playerOnOff + ", 볼륨:" + music.volume);
    }
}
