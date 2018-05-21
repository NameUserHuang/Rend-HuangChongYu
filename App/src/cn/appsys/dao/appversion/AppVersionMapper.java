package cn.appsys.dao.appversion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppVersion;

public interface AppVersionMapper {
	
	public List<AppVersion> getAppVersionList(@Param("appId")Integer appId) throws Exception;
	//����
	public int add(AppVersion appVersion)throws Exception;
	//��ID��ѯappId
	public int getVersionCountByAppId(@Param("appId")Integer appId)throws Exception;
	//��ID��ѯ ����ɾ��
	public int deleteVersionByAppId(@Param("appId")Integer appId)throws Exception;
	//��ID��ѯid
	public AppVersion getAppVersionById(@Param("id")Integer id)throws Exception;
	//��apk���ϴ�	
	public int modify(AppVersion appVersion)throws Exception;
	//ɾ��
	public int deleteApkFile(@Param("id")Integer id)throws Exception;
}
