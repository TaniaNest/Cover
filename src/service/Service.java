package service;

import controller.Controller;
import model.Cover;

public class Service {

    public boolean takenAction(Cover coverOne, Cover coverTwo) {

        if (getBiggestSide(coverOne) > getBiggestSide(coverTwo) && getSmallerSide(coverOne) > getSmallerSide(coverTwo)) {
            return true;
        } else if (getBiggestSide(coverOne) < getBiggestSide(coverTwo) && getSmallerSide(coverOne) < getSmallerSide(coverTwo)) {
            return true;
        } else if (getBiggestSide(coverTwo) >= getDiagonal(coverOne)) {
            return true;
        } else if (getBiggestSide(coverOne) >= getDiagonal(coverTwo)) {
            return true;
        } else {
            return false;
        }
    }

    private float getSmallerSide(Cover cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        if (height > width)
            return width;
        else return height;
    }

    private float getBiggestSide(Cover cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        if (height < width)
            return width;
        else return height;
    }

    private float getDiagonal(Cover cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        float diagonal = (float) (Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }

}
