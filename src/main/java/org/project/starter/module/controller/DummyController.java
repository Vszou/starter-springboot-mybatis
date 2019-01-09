package org.project.starter.module.controller;

import org.project.starter.core.Result;
import org.project.starter.core.ResultGenerator;
import org.project.starter.module.model.Dummy;
import org.project.starter.module.service.DummyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title 
 * 
 * @author CodeGenerator
 * @date 2018/12/28
 */
@RestController
@RequestMapping("/dummy")
public class DummyController {
    @Resource
    private DummyService dummyService;

    @PostMapping("/add")
    public Result add(Dummy dummy) {
        dummyService.save(dummy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        dummyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Dummy dummy) {
        dummyService.update(dummy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Dummy dummy = dummyService.findById(id);
        return ResultGenerator.genSuccessResult(dummy);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Dummy> list = dummyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
