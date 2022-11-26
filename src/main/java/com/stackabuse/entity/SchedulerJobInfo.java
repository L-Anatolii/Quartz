package com.stackabuse.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
@Table(name = "scheduler_job_info")
public class SchedulerJobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long jobId;
    @Column(name ="jobName")
    private String jobName;
    @Column(name ="jobGroup")
    private String jobGroup;
    @Column(name ="jobStatus")
    private String jobStatus;
    @Column(name ="jobClass")
    private String jobClass;
    @Column(name ="cronExpression")
    private String cronExpression;
    @Column(name ="desc1")
    private String desc;
    @Column(name ="interfaceName")
    private String interfaceName;
    @Column(name ="repeatTime")
    private Long repeatTime;
    @Column(name ="cronJob")
    private Boolean cronJob;
}
