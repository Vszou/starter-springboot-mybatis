package org.project.starter.module.service.impl;

import org.project.starter.module.dao.DummyMapper;
import org.project.starter.module.model.Dummy;
import org.project.starter.module.service.DummyService;
import org.project.starter.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @title 
 * 
 * @author CodeGenerator
 * @date 2018/12/28
 */
@Service
@Transactional
public class DummyServiceImpl extends AbstractService<Dummy> implements DummyService {
    @Resource
    private DummyMapper dummyMapper;

}
