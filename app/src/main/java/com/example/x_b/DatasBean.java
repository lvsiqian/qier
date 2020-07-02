package com.example.x_b;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public  class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author : VIPyinzhiwei
             * canEdit : false
             * chapterId : 294
             * chapterName : 完整项目
             * collect : false
             * courseId : 13
             * desc : 基于 Kotlin 语言仿写「开眼 Eyepetizer」的一个短视频 Android 客户端项目，采用 Jetpack + 协程实现的 MVVM 架构。

             值得一提的是，所有 UI 都是经过标注工具测量后的，无论是字体颜色、大小、间距等几乎都是像素级模仿的「开眼 Eyepetizer」Android 客户端 App，对应的 v6.3.1 版本（目前更新版）。
             * descMd :
             * envelopePic : https://www.wanandroid.com/blogimgs/c90df328-30b0-4fc9-906a-c661ed450cad.png
             * fresh : true
             * id : 13976
             * link : https://www.wanandroid.com/blog/show/2774
             * niceDate : 16小时前
             * niceShareDate : 16小时前
             * origin :
             * prefix :
             * projectLink : https://github.com/VIPyinzhiwei/Eyepetizer
             * publishTime : 1592757812000
             * realSuperChapterId : 293
             * selfVisible : 0
             * shareDate : 1592757812000
             * shareUser :
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=294"}]
             * title : 一款高仿 Eyepetizer | 开眼短视频的 MVVM 开源项目
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
    @Id
            private Long id;

            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private boolean isCheckd;
        @Generated(hash = 336618542)
        public DatasBean(String apkLink, int audit, String author, boolean canEdit, int chapterId, String chapterName,
                boolean collect, int courseId, String desc, String descMd, String envelopePic, boolean fresh, Long id,
                String link, String niceDate, String niceShareDate, String origin, String prefix, String projectLink,
                long publishTime, int realSuperChapterId, int selfVisible, long shareDate, String shareUser, int superChapterId,
                String superChapterName, String title, int type, int userId, int visible, int zan, boolean isCheckd) {
            this.apkLink = apkLink;
            this.audit = audit;
            this.author = author;
            this.canEdit = canEdit;
            this.chapterId = chapterId;
            this.chapterName = chapterName;
            this.collect = collect;
            this.courseId = courseId;
            this.desc = desc;
            this.descMd = descMd;
            this.envelopePic = envelopePic;
            this.fresh = fresh;
            this.id = id;
            this.link = link;
            this.niceDate = niceDate;
            this.niceShareDate = niceShareDate;
            this.origin = origin;
            this.prefix = prefix;
            this.projectLink = projectLink;
            this.publishTime = publishTime;
            this.realSuperChapterId = realSuperChapterId;
            this.selfVisible = selfVisible;
            this.shareDate = shareDate;
            this.shareUser = shareUser;
            this.superChapterId = superChapterId;
            this.superChapterName = superChapterName;
            this.title = title;
            this.type = type;
            this.userId = userId;
            this.visible = visible;
            this.zan = zan;
            this.isCheckd = isCheckd;
        }
        @Generated(hash = 128729784)
        public DatasBean() {
        }
        public String getApkLink() {
            return this.apkLink;
        }
        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }
        public int getAudit() {
            return this.audit;
        }
        public void setAudit(int audit) {
            this.audit = audit;
        }
        public String getAuthor() {
            return this.author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public boolean getCanEdit() {
            return this.canEdit;
        }
        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }
        public int getChapterId() {
            return this.chapterId;
        }
        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }
        public String getChapterName() {
            return this.chapterName;
        }
        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }
        public boolean getCollect() {
            return this.collect;
        }
        public void setCollect(boolean collect) {
            this.collect = collect;
        }
        public int getCourseId() {
            return this.courseId;
        }
        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }
        public String getDesc() {
            return this.desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        public String getDescMd() {
            return this.descMd;
        }
        public void setDescMd(String descMd) {
            this.descMd = descMd;
        }
        public String getEnvelopePic() {
            return this.envelopePic;
        }
        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }
        public boolean getFresh() {
            return this.fresh;
        }
        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getLink() {
            return this.link;
        }
        public void setLink(String link) {
            this.link = link;
        }
        public String getNiceDate() {
            return this.niceDate;
        }
        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }
        public String getNiceShareDate() {
            return this.niceShareDate;
        }
        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }
        public String getOrigin() {
            return this.origin;
        }
        public void setOrigin(String origin) {
            this.origin = origin;
        }
        public String getPrefix() {
            return this.prefix;
        }
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }
        public String getProjectLink() {
            return this.projectLink;
        }
        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }
        public long getPublishTime() {
            return this.publishTime;
        }
        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }
        public int getRealSuperChapterId() {
            return this.realSuperChapterId;
        }
        public void setRealSuperChapterId(int realSuperChapterId) {
            this.realSuperChapterId = realSuperChapterId;
        }
        public int getSelfVisible() {
            return this.selfVisible;
        }
        public void setSelfVisible(int selfVisible) {
            this.selfVisible = selfVisible;
        }
        public long getShareDate() {
            return this.shareDate;
        }
        public void setShareDate(long shareDate) {
            this.shareDate = shareDate;
        }
        public String getShareUser() {
            return this.shareUser;
        }
        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }
        public int getSuperChapterId() {
            return this.superChapterId;
        }
        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }
        public String getSuperChapterName() {
            return this.superChapterName;
        }
        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }
        public String getTitle() {
            return this.title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public int getType() {
            return this.type;
        }
        public void setType(int type) {
            this.type = type;
        }
        public int getUserId() {
            return this.userId;
        }
        public void setUserId(int userId) {
            this.userId = userId;
        }
        public int getVisible() {
            return this.visible;
        }
        public void setVisible(int visible) {
            this.visible = visible;
        }
        public int getZan() {
            return this.zan;
        }
        public void setZan(int zan) {
            this.zan = zan;
        }
        public boolean getIsCheckd() {
            return this.isCheckd;
        }
        public void setIsCheckd(boolean isCheckd) {
            this.isCheckd = isCheckd;
        }


    
            

    
}