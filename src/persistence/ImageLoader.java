package persistence;

import model.Image;

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}
