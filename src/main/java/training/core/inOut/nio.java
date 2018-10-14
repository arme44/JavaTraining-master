package training.core.inOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

class nio {

    public static void main(String[] args) throws IOException {
        File xml = new File("./src/training/configFiles/disches.xml");
        File prop = new File("./src/training/configFiles/disches.properties");
        File file = new File("./src/training/core/inOut/dataFile.txt");

        writeTo(file);
        readFrom(file);

        Path path = Paths.get(file.toURI());
        testMINEType(path);
        testMINEType(xml.toPath());
        testMINEType(prop.toPath());

        changeModifyTime(prop);

    }

    private static void changeModifyTime(File prop) throws IOException {
        Path p = prop.toPath();
        FileTime originLastModifiedTime = Files.getLastModifiedTime(p,
                LinkOption.NOFOLLOW_LINKS);
        System.out.println(originLastModifiedTime.toString());

        FileTime newTime = FileTime.fromMillis(originLastModifiedTime.toMillis() - 1_000_000);

        Files.setLastModifiedTime(p,newTime);
        System.out.println(Files.getLastModifiedTime(p,
                LinkOption.NOFOLLOW_LINKS));
    }

    private static void testMINEType(Path path) throws IOException {
        String type = Files.probeContentType(path);
        System.out.println("File type: " + type);
    }

    private static void readFrom(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            FileChannel fc = fis.getChannel();

            ByteBuffer bb = ByteBuffer.allocate(100);

            while (fc.read(bb) > 0) {
                bb.rewind();
                String str = Charset.forName("UTF-8").decode(bb).toString();
                System.out.println(str);
                bb.flip();

            }

        } catch (IOException e) {

        }
    }

    private static void writeTo(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel fc = fos.getChannel();

            ByteBuffer bb = ByteBuffer.allocate(1000);

            String deal = "upto 10% off on fashion";
            bb.put(deal.getBytes());
            bb.flip();
            fc.write(bb);

            deal = "\nupto 30% off on bags";
            bb.flip();
            bb.put(deal.getBytes());
            bb.flip();
            fc.write(bb);
        } catch (IOException e) {

        }
    }
}