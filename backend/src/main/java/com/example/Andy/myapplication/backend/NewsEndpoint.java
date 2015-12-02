package com.example.Andy.myapplication.backend;

import com.example.Andy.myapplication.backend.entry.NewsRecord;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import java.util.List;


@Api(
        name = "news",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Andy.example.com",
                ownerName = "backend.myapplication.Andy.example.com",
                packagePath = ""
        )
)
public class NewsEndpoint {

    @ApiMethod(name = "save", path = "news/save")
    public void save(NewsRecord newsRecord) {
        final NewsRecord record = newsRecord;
        OfyService.ofy().save().entities(newsRecord).now();

    }

    /**
     * 取得最新消息 透過時間取得
     *
     * @param yyymmdd
     * @param level
     * @return
     */
    @ApiMethod(name = "getNewsByDate", path = "news/getNewsByDate")
    public NewDTO getNewsByDate(@Named("yyymmdd") final String yyymmdd, @Named("level") int level) {
        final List<NewsRecord> lists = OfyService.ofy().load().
                type(NewsRecord.class)//
                .filter("yyyymmdd=", yyymmdd)//
                .filter("delete!=", "Y")
                .filter("level<=", level)
                .list();//

        final NewDTO dto = new NewDTO();
        dto.setRecordList(lists);
        return dto;
    }

    @ApiMethod(name = "getHistory", path = "news/history")
    public NewDTO getHistory(@Named("yyymmdd") final String yyymmdd) {
        final List<NewsRecord> lists = OfyService.ofy().load().
                type(NewsRecord.class)//
                .filter("yyyymmdd=?", yyymmdd)//
                .list();//

        final NewDTO dto = new NewDTO();
        dto.setRecordList(lists);
        return dto;
    }
}
