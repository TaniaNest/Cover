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
        } else return getBiggestSide(coverOne) >= getDiagonal(coverTwo);
    }

    private float getSmallerSide(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        return Math.min(height, width);
    }

    private float getBiggestSide(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        return Math.max(height, width);
    }

    private float getDiagonal(CoverModel cover) {
        float width = cover.getWidth();
        float height = cover.getHeight();
        return (float) (Math.pow(width, 2) + Math.pow(height, 2));
    }

}
