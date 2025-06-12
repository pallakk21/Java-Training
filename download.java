
//     public  static void download( String file){
//         for (int i=0; i<=5; i++) {
//              System.out.println("File Downloading......." + " " + (i*20) +"%" );
//         }
//         try {
//           Thread.sleep(2000);
//         } catch (Exception e) {
//         }
//         System.out.println(  file + "  Done");
//     }
// }

  class downloadfile extends Thread{
     String filename;
    public downloadfile(String filename){
        this.filename=filename;
    }


    public void run(){
        for (int i=0; i<=5; i++) {
              System.out.println( " File Downloading......." + " " + (i*20) +"%" );
        }
        try {
          Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(  filename + "  Done");
    }
    }
   
public class download
{ public static void main(String[] args) {
    downloadfile fileA = new downloadfile("file A");
    downloadfile fileB = new downloadfile("file B");
    fileA.start();
     fileB.start();
}

}





// public class download { 
//     public static void main(String[] args) {
//     filedownload obj = new filedownload();
//     obj.download("file A");
//       obj.download("file B");
// }
    

