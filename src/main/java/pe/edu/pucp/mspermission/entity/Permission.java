package pe.edu.pucp.mspermission.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pstk_policy", schema = "pucp_stack")
public class Permission {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "POLICY_ID")
    private Integer permissionId;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "DESCRIPTION")
    private String description;
}
