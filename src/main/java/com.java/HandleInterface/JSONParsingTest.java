package com.java.HandleInterface;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-30 上午10:30
 */
public class JSONParsingTest {
    public static final String urlString = "http://news-at.zhihu.com/api/4/news/latest";
    public static void main(String[] args) throws Exception {
        try {
            String jsonString = new String(HttpUtil.get(urlString));
            JSONObject latestNewsJSON = JSON.parseObject(jsonString);
            String date = latestNewsJSON.getString("date");
            JSONArray top_storiesJSON = latestNewsJSON.getJSONArray("top_stories");
            LatestNews latest = new LatestNews();
            List<LatestNews.TopStory> stories = new ArrayList<LatestNews.TopStory>();

            for (int i = 0; i < top_storiesJSON.size(); i++) {
                LatestNews.TopStory story = new LatestNews.TopStory();
                story.setId(((JSONObject) top_storiesJSON.get(i)).getInteger("id"));
                story.setType(((JSONObject) top_storiesJSON.get(i)).getInteger("type"));
                story.setImage(((JSONObject) top_storiesJSON.get(i)).getString("image"));
                story.setTitle(((JSONObject) top_storiesJSON.get(i)).getString("title"));
                stories.add(story);
            }
            latest.setDate(date);
            System.out.println("date: " + latest.getDate());
            for (int i = 0; i < stories.size(); i++) {
                System.out.println(stories.get(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
