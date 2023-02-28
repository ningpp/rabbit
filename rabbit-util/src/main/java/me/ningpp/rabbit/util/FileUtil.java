package me.ningpp.rabbit.util;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class FileUtil {

    private FileUtil() {
    }

    public static List<File> getFiles(String root, String ext, boolean withChildren) {
        File dir = null;
        if (StringUtils.isNotEmpty(root)) {
            dir = new File(root);
        }
        return getFiles(dir, ext, withChildren);
    }

    public static List<File> getFiles(File root, String ext, boolean withChildren) {
        if (root != null && root.isDirectory()) {
            var files = root.listFiles();
            if (files != null && files.length > 0) {
                List<File> results = new ArrayList<>(64);
                for (File file : files) {
                    if (file.isDirectory() && withChildren) {
                        results.addAll(getFiles(file, ext, withChildren));
                    } else if (file.isFile()
                            && (ext == null || file.getName().endsWith(ext))) {
                        results.add(file);
                    }
                }
                return results;
            }
        }
        return new ArrayList<>(0);
    }
}
