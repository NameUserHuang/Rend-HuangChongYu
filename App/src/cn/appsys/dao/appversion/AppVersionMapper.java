package cn.appsys.dao.appversion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppVersion;

public interface AppVersionMapper {
	
	public List<AppVersion> getAppVersionList(@Param("appId")Integer appId) throws Exception;
	//新增
	public int add(AppVersion appVersion)throws Exception;
	//按ID查询appId
	public int getVersionCountByAppId(@Param("appId")Integer appId)throws Exception;
	//按ID查询 进行删除
	public int deleteVersionByAppId(@Param("appId")Integer appId)throws Exception;
	//按ID查询id
	public AppVersion getAppVersionById(@Param("id")Integer id)throws Exception;
	//将apk包上传	
	public int modify(AppVersion appVersion)throws Exception;
	//删除
	public int deleteApkFile(@Param("id")Integer id)throws Exception;
}
