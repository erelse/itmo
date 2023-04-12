package ru.itmo.lessons.lesson12.hw12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;


public class Application {
    public static void throwException(Status status) throws AccessDeniedException{
        try {
            switch (status) {
                case JAR_ERROR:
                    throw new JarException();

                case FILE_NOT_FOUND:
                    throw new FileNotFoundException();

                case ACCESS_DENIED:
                    throw new AccessDeniedException("Access Denied");

            }

        } catch (FileNotFoundException | JarException e) {
            e.printStackTrace();
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args)
            throws AccessDeniedException {
        throwException(Status.values()[(int) (Math.random() * Status.values().length)]);
    }
}
