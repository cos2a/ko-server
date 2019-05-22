package org.ko.sigma.data.master.domain;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_role_menu")
public class RoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.role_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.menu_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.available_status
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Short availableStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.create_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Long createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.create_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.update_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Long updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.update_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_menu
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.id
     *
     * @return the value of t_role_menu.id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.id
     *
     * @param id the value for t_role_menu.id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.role_id
     *
     * @return the value of t_role_menu.role_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.role_id
     *
     * @param roleId the value for t_role_menu.role_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.menu_id
     *
     * @return the value of t_role_menu.menu_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.menu_id
     *
     * @param menuId the value for t_role_menu.menu_id
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.available_status
     *
     * @return the value of t_role_menu.available_status
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Short getAvailableStatus() {
        return availableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.available_status
     *
     * @param availableStatus the value for t_role_menu.available_status
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setAvailableStatus(Short availableStatus) {
        this.availableStatus = availableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.create_user
     *
     * @return the value of t_role_menu.create_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.create_user
     *
     * @param createUser the value for t_role_menu.create_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.create_date
     *
     * @return the value of t_role_menu.create_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.create_date
     *
     * @param createDate the value for t_role_menu.create_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.update_user
     *
     * @return the value of t_role_menu.update_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.update_user
     *
     * @param updateUser the value for t_role_menu.update_user
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.update_date
     *
     * @return the value of t_role_menu.update_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.update_date
     *
     * @param updateDate the value for t_role_menu.update_date
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", availableStatus=").append(availableStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RoleMenu other = (RoleMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getAvailableStatus() == null ? other.getAvailableStatus() == null : this.getAvailableStatus().equals(other.getAvailableStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_menu
     *
     * @mbg.generated Tue May 21 23:25:19 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getAvailableStatus() == null) ? 0 : getAvailableStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}