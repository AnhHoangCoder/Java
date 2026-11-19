
package J05024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {

    public static class Student {
        private String id, name, lop, email;

        public Student(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getId() {
            return id.substring(3, 7);
        }

        public String getLop() {
            return lop;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %s", id, name, lop, email);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine().trim());

        ArrayList<Student> studs = new ArrayList<>();

        while (t-- > 0) {
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();

            studs.add(new Student(id, name, lop, email));
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

            for (Student stud : studs) {

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
