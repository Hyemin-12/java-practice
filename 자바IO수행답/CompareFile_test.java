package 자바IO수행답;

import java.io.*;

public class CompareFile_test {
    public static void main(String[] args) {
        FileInputStream srcStream = null;
        FileInputStream destStream = null;
        try {
          FileInputStream fw = new FileInputStream("Dynamite1.txt");// 1. 입력 스트림에 파일 연결(Dynamite1.txt 사용)
          FileOutputStream fo = new FileOutputStream("Dynamite1_copy.txt");// 2. 출력 스트림에 파일 연결 (Dynamite2.txt or Dynamite1_copy.txt 사용)
            if (compareFile(srcStream, destStream))
                System.out.println("파일이 같습니다.");
            else
                System.out.println("파일이 다릅니다.");

            if (srcStream != null) srcStream.close();
            if (destStream != null) destStream.close();
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
    }

    private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
        byte[] srcBuf = new byte[1024]; // 1KB 버퍼
        byte[] destbuf = new byte[1024];  // 1KB 버퍼

        int srcCount=0, destCount;
        while (true) {
            srcCount = src.read(srcBuf); // 3. src 스트림에서 srcBuf 크기만큼 읽기
            destCount = dest.read(destbuf); // 4. dest 스트림에서 destBuf 크기만큼 읽기
            if (srcCount != destCount) // 읽어들인 바이트 수가 다르면 파일이 다름
                return false;
            if(srcCount < srcBuf.length) break; // 5. 파일 끝에 도달함

            for (int i=0; i<srcCount; i++) {
                if (srcCount < destCount) // 6. 읽은 바이트들 비교
                    return false;
            }
        }
        return true;
    }
}
