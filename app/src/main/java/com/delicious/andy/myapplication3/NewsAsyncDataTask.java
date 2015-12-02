package com.delicious.andy.myapplication3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.delicious.andy.myapplication3.util.CommonUtils;
import com.example.andy.myapplication.backend.news.News;
import com.example.andy.myapplication.backend.news.model.NewDTO;
import com.example.andy.myapplication.backend.news.model.NewsRecord;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.logging.Logger;

public class NewsAsyncDataTask extends AsyncTask<String, Void, NewDTO> {

    private static final Logger log = Logger.getLogger(NewsAsyncDataTask.class.getName());


    private static News service = null;
    private Context context;


    public NewsAsyncDataTask(Context context) {
        this.context = context;
    }

    @Override
    protected NewDTO doInBackground(String... params) {
        StringBuffer buffer = new StringBuffer();
        if (service == null) {  // Only do this once
            News.Builder builder = new News.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl(CommonUtils.API_URL);
            service = builder.build();
        }
        try {

            return service.getNewsByDate(0, CommonUtils.getNowDate()).execute();
        } catch (IOException e) {

        }

        return null;
    }

    @Override
    protected void onPostExecute(NewDTO s) {

        if (s == null) {
            Toast.makeText(this.context, "no ok", Toast.LENGTH_SHORT).show();
        } else {
            for (NewsRecord record : s.getRecordList()) {
                log.info(record.toString());
            }
            Toast.makeText(this.context, " ok", Toast.LENGTH_SHORT).show();
        }


    }
}
