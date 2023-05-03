// class StreamingSongTestDrive{
//     public static void main(String[] args){

//         StreamingSong song = new StreamingSong()
//         song.artist = "The Beatles";
//         song.title = "Come together";
//         song.play();
//         song.printDetails();
//     }
// }

class DrumKitTestDrive{
    public static void main(String[] args){
        DrumKit d= new DrumKit();

        d.playSnare();
        d.playTopHat();
        d.snare = false;

        if (d.snare == true){
            d.playSnare();
        }


    }
}