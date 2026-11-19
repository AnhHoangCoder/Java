package J05024;

import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine().trim());

        ArrayList<Push.Student> studs = new ArrayList<>();

        while (t-- > 0) {
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();

            studs.add(new Push.Student(id, name, lop, email));
        }

        int q = Integer.parseInt(br.readLine().trim());

        while (q-- > 0) {
            String nganh = br.readLine().trim().toUpperCase();

            String tmp = "";

            if (nganh.equals("KE TOAN")) {
                tmp = "DCKT";
            } else if (nganh.equals("CONG NGHE THONG TIN")) {
                tmp = "DCCN";
            } else if (nganh.equals("AN TOAN THONG TIN")) {
                tmp = "DCAT";
            } else if (nganh.equals("VIEN THONG")) {
                tmp = "DCVT";
            } else if (nganh.equals("DIEN TU")) {
                tmp = "DCDT";
            }

            StringBuilder sb = new StringBuilder();

            sb.append(String.format(
                    "DANH SACH SINH VIEN NGANH %s:\n", nganh
            ));

            for (Push.Student stud : studs) {

                if (tmp.equals(stud.getId())) {

                    if ((tmp.equals("DCCN") || tmp.equals("DCAT"))
                            && stud.getLop().startsWith("E")) {
                        continue;
                    }

                    sb.append(stud).append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}
