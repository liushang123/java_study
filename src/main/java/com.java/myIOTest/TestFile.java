package com.java.myIOTest;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-21 上午9:18
 */
public class TestFile {
    public static void readAndWriteFile1() {
        File file = new File("readAndWriteFile1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = "This is a test file!";
        byte bt[] = new byte[1024];
        bt = str.getBytes();
        try {
            FileOutputStream in = new FileOutputStream(file);
            try {
                in.write(bt, 0, bt.length);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream out = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(out);
            int ch = 0;
            while ((ch = isr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影音等文件
     * 
     * @param fileName
     *            文件的名
     */
    public static void readFileByBytes(String fileName) {
        File file = new File(fileName);
        InputStream in = null;
        try {
            System.out.println("\n以字节为单位读取文件内容,一次读一个字节：");
            in = new FileInputStream(file);
            int tempByte;
            while ((tempByte = in.read()) != -1) {
                System.out.write(tempByte);
            }
            System.out.println("");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try {
            System.out.println("以字节为单位读取文件内容，一次读多个字节:");
            byte[] tempBytes = new byte[4];
            int byteread = 0;
            in = new FileInputStream(fileName);
            while ((byteread = in.read(tempBytes)) != -1) {
                System.out.write(tempBytes, 0, byteread);
                System.out.println("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * 以字符为单位读取文件，常用于都文本，数字等类型的文件
     * 
     * @param fileName
     */
    public static void readFileByChars(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            System.out.println("\n义字符为单位读取文件内容，一次读一个字节：");
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                if (((char) tempchar) != 'r') {
                    System.out.print((char) tempchar);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("\n义字符为单位读取文件，一次读多个字符：");
            char[] tempchars = new char[2];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(file));
            while ((charread = reader.read(tempchars)) != -1) {
                if ((charread == tempchars.length) && (tempchars[tempchars.length - 1] != 'r')) {
                    System.out.println(tempchars);
                } else {
                    for (int i = 0; i < charread; i++) {
                        if (tempchars[i] == 'r') {
                            continue;
                        } else {
                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * 以行为单位读取文件，常用于读取面向行的格式化文件
     * 
     * @param fileName
     */
    public static void readFileByLine(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                boolean flag = true;
                // System.out.println("line " + line + " : ");
                // for (int i = 0; i < tempString.length(); i++) {
                // char item = tempString.charAt(i);
                // if (flag) {
                // if (item == ' ') {
                // continue;
                // } else {
                // System.out.print(item);
                // flag = false;
                // }
                // } else {
                // System.out.print(item);
                // }
                // }
                System.out.println("line " + line + " : " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * 随机读取文件内容
     * 
     * @param fileName
     */
    public static void readFileByRandomAccess(String fileName) {
        RandomAccessFile randomFile = null;
        try {
            System.out.println("随机读取一段文件内容： ");
            randomFile = new RandomAccessFile(fileName, "r");
            long fileLength = randomFile.length();
            int beginIndex = (fileLength > 4) ? 4 : 0;
            randomFile.seek(beginIndex);// 设置读取文件的偏移量
            byte[] bytes = new byte[10];
            int byteread = 0;
            while ((byteread = randomFile.read(bytes)) != -1) {
                System.out.write(bytes, 0, byteread);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomFile != null) {
                try {
                    randomFile.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * 在文件中添加内容
     * 
     * @param fileName
     * @param content
     */
    public static void appendMethodA(String fileName, String content) {
        try {
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
            long fileLength = randomFile.length();
            // 将写文件指针移动到文件尾
            randomFile.seek(fileLength);
            randomFile.writeBytes(content);
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int low1 = 0, low2 = 0;
        if (nums1.length == 0 || nums2.length == 0) {
            if (nums1.length == 0) {
                return nums2.length % 2 == 0 ? (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0 : nums2[nums2.length / 2];
            } else {
                return nums1.length % 2 == 0
                        ? (double) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2.0
                        : (double) nums1[nums1.length / 2];
            }
        }
        int high1 = nums1.length - 1, high2 = nums2.length - 1;
        int mid1 = (high1 + low1) / 2, mid2 = (high2 + low2) / 2;
        int mid = (high1 + high2) / 2 + 1;
        int flag = 0;
        while (true) {
            if (nums1[mid1] < nums2[mid2]) {
                if (mid1 + low2 + 2 > mid) {
                    flag = 1;
                    break;
                }

                else {
                    if (mid1 == high1) {
                        flag = 2;
                        break;
                    }
                    low1 = mid1 + 1;
                    mid1 = (high1 + low1) / 2;

                }

            } else if (nums1[mid1] > nums2[mid2]) {
                if (mid2 + low1 + 2 > mid) {
                    flag = 3;
                    break;
                } else {
                    if (mid2 == high2) {
                        flag = 4;
                        break;
                    }
                    low2 = mid2 + 1;
                    mid2 = (high2 + low2) / 2;

                }

            } else {
                if (mid1 + mid2 >= mid) {
                    flag = 5;
                    break;
                }
                if (nums1[mid1 + 1] > nums2[mid2 + 1]) {
                    low2 = mid2 + 1;
                    mid2 = (high2 + low2) / 2;
                    if (mid2 + low1 + 2 > mid) {
                        flag = 3;
                        break;
                    }
                } else if (nums1[mid1 + 1] < nums2[mid2 + 1]) {
                    low1 = mid1 + 1;
                    mid1 = (high1 + low1) / 2;
                    if (mid1 + low2 + 2 > mid) {
                        flag = 1;
                        break;
                    }
                } else {
                    mid1++;
                }
            }
        }
        double res = 0.0;
        if (flag == 1) {
            if (mid * 2 == high1 + high2 + 2) {
                res = ((double) nums1[mid1] + (double) nums2[low2]) / 2;
            } else {
                res = nums1[mid1] < nums2[low2] ? (double) nums1[mid1] : (double) nums2[low2];
            }
        }
        if (flag == 2) {
            res = (double) nums2[mid - high1];
        }
        if (flag == 3) {
            if (mid * 2 == high1 + high2 + 2) {
                res = ((double) nums2[mid2] + (double) nums1[low1]) / 2;
            } else {
                res = nums2[mid2] < nums1[low1] ? (double) nums2[mid2] : (double) nums1[low1];
            }
        }
        if (flag == 4) {
            res = (double) nums1[mid - high2];
        }
        if (flag == 5) {
            res = (double) nums1[mid1];
        }

        return res;

    }

    public static void main(String[] args) {
        /*int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        findMedianSortedArrays(nums1, nums2);
        String indexType = "6-6 洗车指数";
        String[] temp = indexType.split(" ");
        String a = temp[1];
        Map<Integer, Integer> num = new HashMap<Integer, Integer>();
        Integer.parseInt("1");
        Map<Character, Integer> aaaa = new HashMap<Character, Integer>();*/

        //TestFile.readAndWriteFile1();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        String a = new String("aaaa");
        list1.add(a);
        System.out.println(list1.size());
        System.out.println(list2.size());

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileStr = df.format(new Date());
        System.out.println(fileStr);

        String fileName = "readAndWriteFile1.txt";
        // TestFile.readFileByBytes(fileName);
        // TestFile.readFileByChars(fileName);
        TestFile.readFileByLine(fileName);
        TestFile.readFileByRandomAccess(fileName);

        String content = "Append a String";
        TestFile.appendMethodA(fileName, content);
    }
}
