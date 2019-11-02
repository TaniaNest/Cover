package service;

import model.CoverModel;

public class CoverService {

    public boolean takenAction(CoverModel coverOne, CoverModel coverTwo) {

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

    private float getSmallerSide(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        if (height > width)
            return width;
        else return height;
    }

    private float getBiggestSide(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        if (height < width)
            return width;
        else return height;
    }

    private float getDiagonal(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        float diagonal = (float) (Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }

}
