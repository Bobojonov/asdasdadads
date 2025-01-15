package codingCompetitive.advanceOfCode;

import java.util.ArrayList;
import java.util.List;

public class DaySeven extends AOCTasks {

    public DaySeven() {
        super("7");
    }

    public static abstract class Node {
        public Folder folder;
        public String name;

        public abstract long getSize();
    }

    public static class File extends Node {
        public int size;
        @Override
        public long getSize() {
            return size;
        }
    }
    public static class Folder extends Node {
        public List<Node> contents = new ArrayList<>();
        public List<Folder> getSubFolder() {
            List<Folder> folders = new ArrayList<>();
            for(Node n: contents)
                if (n instanceof Folder)
                    folders.add((Folder) n);
            return folders;
        }

        public long getSize() {
            long size = 0;
            for(Node n: contents)
                size = size + n.getSize();
            return size;
        }
    }

    @Override
    void solve(List<String> input) {
        Folder root = new Folder();
        root.name = "/";
        Folder currentFolder = root;
        for (int i = 1; i < input.size(); i++) {
            String[] parts = input.get(i).split(" ");
            if (parts[0].equals("$")) {
                if (parts[1].equals("cd")) {
                    if (parts[2].equals(".."))
                        currentFolder = currentFolder.folder;
                    else {
                        for (Node n: currentFolder.contents) {
                            if (n.name.equals(parts[2])) {
                                currentFolder = (Folder) n;
                                break;
                            }
                        }
                    }
                }
            } else if (parts[0].equals("dir")) {
                Folder folder = new Folder();
                folder.folder = currentFolder;
                folder.name = parts[1];
                currentFolder.contents.add(folder);
            } else {
                File file = new File();
                file.folder = currentFolder;
                file.name = parts[1];
                file.size = Integer.parseInt(parts[0]);
                currentFolder.contents.add(file);
            }
            List<Folder> smallerFolders = new ArrayList<>();
            List<Folder> toCheck = new ArrayList<>(root.getSubFolder());
            while (toCheck.size() > 0) {
                Folder fold = toCheck.remove(0);
                toCheck.addAll(fold.getSubFolder());
                if (fold.getSize() <= 100000)
                    smallerFolders.add(fold);
            }
            long sum = 0;
            int totalSpace = 70000000;
            long freeSpace = totalSpace - root.getSize();
            long smallestFree = Integer.MAX_VALUE;
            toCheck = new ArrayList<>(root.getSubFolder());
            while (toCheck.size() > 0) {
                Folder fold = toCheck.remove(0);
                toCheck.addAll(fold.getSubFolder());
                long size = fold.getSize();
                if(freeSpace + size > 30000000 && size < smallestFree)
                    smallestFree = size;
            }
            lap(smallestFree);
        }
    }

    public static void main(String[] args) {
        DaySeven daySeven = new DaySeven();
    }
}
