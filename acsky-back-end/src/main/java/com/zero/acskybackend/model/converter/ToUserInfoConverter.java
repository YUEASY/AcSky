package com.zero.acskybackend.model.converter;

import com.zero.acskybackend.model.po.UserInfo;
import com.zero.acskybackend.model.vo.UserInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * ToUserInfoConverter
 *
 * @author ZERO
 * @date 2023/7/2
 */
@Mapper
public interface ToUserInfoConverter {

    ToUserInfoConverter CONVERTER = Mappers.getMapper(ToUserInfoConverter.class);

    /**
     * ToUserInfoVO
     * @param userInfoVO userInfoVO
     * @return UserInfo
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "account", target = "account")
    @Mapping(source = "email", target = "phone")
    @Mapping(source = "profile", target = "profile")
    @Mapping(source = "avatar", target = "avatar")
    @Mapping(source = "createDate", target = "createDate")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "submitCnt", target = "submitCnt")
    @Mapping(source = "passCnt", target = "passCnt")
    UserInfo toUserInfo(UserInfoVO userInfoVO);

}
