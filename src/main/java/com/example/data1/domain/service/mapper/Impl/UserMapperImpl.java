package com.example.data1.domain.service.mapper.Impl;

import com.example.data1.domain.dto.UserDto;
import com.example.data1.domain.model.UserModel;
import com.example.data1.domain.service.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userModel.getId() );
        userDto.setCreatedAt( userModel.getCreatedAt() );
        userDto.setUpdatedAt( userModel.getUpdatedAt() );
        userDto.setUsername( userModel.getUsername() );
        userDto.setPassword( userModel.getPassword() );
        userDto.setBalance( userModel.getBalance() );
        userDto.setStatus( userModel.getStatus() );
//        userDto.setRoles( roleModelSetToRoleDtoSet( userModel.getRoles() ) );

        return userDto;
    }

//    protected PermissionDto permissionModelToPermissionDto(PermissionModel permissionModel) {
//        if ( permissionModel == null ) {
//            return null;
//        }
//
//        PermissionDto permissionDto = new PermissionDto();
//
//        permissionDto.setCreatedAt( permissionModel.getCreatedAt() );
//        permissionDto.setUpdatedAt( permissionModel.getUpdatedAt() );
//        permissionDto.setId( permissionModel.getId() );
//        permissionDto.setDescription( permissionModel.getDescription() );
//
//        return permissionDto;
//    }
//
//    protected Set<PermissionDto> permissionModelSetToPermissionDtoSet(Set<PermissionModel> set) {
//        if ( set == null ) {
//            return null;
//        }
//
//        Set<PermissionDto> set1 = new HashSet<PermissionDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
//        for ( PermissionModel permissionModel : set ) {
//            set1.add( permissionModelToPermissionDto( permissionModel ) );
//        }
//
//        return set1;
//    }
//
//    protected RoleDto roleModelToRoleDto(RoleModel roleModel) {
//        if ( roleModel == null ) {
//            return null;
//        }
//
//        RoleDto roleDto = new RoleDto();
//
//        roleDto.setCreatedAt( roleModel.getCreatedAt() );
//        roleDto.setUpdatedAt( roleModel.getUpdatedAt() );
//        roleDto.setId( roleModel.getId() );
//        roleDto.setDescription( roleModel.getDescription() );
//        roleDto.setPermissions( permissionModelSetToPermissionDtoSet( roleModel.getPermissions() ) );
//
//        return roleDto;
//    }
//
//    protected Set<RoleDto> roleModelSetToRoleDtoSet(Set<RoleModel> set) {
//        if ( set == null ) {
//            return null;
//        }
//
//        Set<RoleDto> set1 = new HashSet<RoleDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
//        for ( RoleModel roleModel : set ) {
//            set1.add( roleModelToRoleDto( roleModel ) );
//        }
//
//        return set1;
//    }
}
