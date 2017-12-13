package com.tuner168.konstsmide.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;

import com.tuner168.konstsmide.entity.Song;

import java.util.ArrayList;

/**
 * 音乐工具类
 */
public class MusicUtil {
    /**
     * 扫描系统里面的音频文件，返回一个list集合
     */
    public static ArrayList<Song> getMusicData(Context context) {
        ArrayList<Song> list = new ArrayList<Song>();
        // 媒体库查询语句（写一个工具类MusicUtils）
        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null,
                null, MediaStore.Audio.AudioColumns.IS_MUSIC);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                Song song = new Song();
                song.setSong(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE)));
                song.setSinger(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST)));
                song.setPath(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)));
                song.setDuration(cursor.getInt(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION)));
                song.setSize(cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE)));
//                song.album = cursor.getInt(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_ID));
                //
                /*if (song.getSong().contains("_")){
                    String[] str = song.getSong().split("_");
                    song.setSong(str[0]);

                }*/
                int musicColumnIndex = cursor
                        .getColumnIndex(MediaStore.Audio.AudioColumns.ALBUM_KEY);
                String musicAlbumKey = cursor.getString(musicColumnIndex);
                String[] argArr = {musicAlbumKey};
                ContentResolver albumResolver = context.getContentResolver();
                Cursor albumCursor = albumResolver.query(
                        MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, null,
                        MediaStore.Audio.AudioColumns.ALBUM_KEY + " = ?",
                        argArr, null);
                if (null != albumCursor && albumCursor.getCount() > 0) {
                    albumCursor.moveToFirst();
                    int albumArtIndex = albumCursor
                            .getColumnIndex(MediaStore.Audio.AlbumColumns.ALBUM_ART);
                    song.setAlbum(albumCursor.getString(albumArtIndex));

                }

                    /*//
                    if (song.getSize() > 1000 * 800) {
                        // 注释部分是切割标题，分离出歌曲名和歌手 （本地媒体库读取的歌曲信息不规范）
                        if (song.getSong().contains("-")) {
                            String[] str = song.getSong().split("-");
                            song.setSinger(str[0]);
                            song.setSong(str[1]);
                        }
                        list.add(song);
                    }*/
                list.add(song);
            }

            // 释放资源
            cursor.close();
        }

        return list;
    }

    /**
     * 定义一个方法用来格式化获取到的时间
     */

    public static String formatTime(int time) {
        if (time / 1000 % 60 < 10) {
            if (time / 1000 / 60 < 10) {
                return "0" + time / 1000 / 60 + ":0" + time / 1000 % 60;
            } else {
                return time / 1000 / 60 + ":0" + time / 1000 % 60;
            }
        } else {
            if (time / 1000 / 60 < 10) {
                return "0" + time / 1000 / 60 + ":" + time / 1000 % 60;
            } else {
                return time / 1000 / 60 + ":" + time / 1000 % 60;
            }
        }

    }


}