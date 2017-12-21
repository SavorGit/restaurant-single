package com.savor.resturant.utils;


import com.savor.resturant.interfaces.ImageLoader;

/**
 * 图片加载管理器
 * Created by hezd on 2016/6/27.
 */
public class ImageLoaderManager {
    public static ImageLoader getImageLoader() {
        return GlideImageLoader.getInstance();
    }

}
