package com.wangzi.girl.controller;

import com.wangzi.girl.entity.Girl;
import com.wangzi.girl.entity.Result;
import com.wangzi.girl.respository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * desc: 女团restful接口
 * author:prince
 * 2017-11-14 15:23
 */

@RestController
@RequestMapping("/snh")
public class HelloContoller {


    @Autowired
    private GirlRepository
            girlRepository;
/*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;
    @Value("${water}")
    private boolean water;
 */

    /**
     * @param
     * @return
     * @Description:获取成员列表
     * @Date:
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * @param
     * @return
     * @Description:添加一个成员
     * @Date:
     */
    @PostMapping(value = "girls")
    /**验证的结果 会返回到BingingResult对象中*/
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        Result<Girl> result = new Result<Girl>();
        if (bindingResult.hasErrors()) {
            //code为1 表示添加失败
            result.setCode(1);
            //获取验证的错误信息
            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return result;
        }

        //girl.setCupSize(girl.getCupSize());
        //girl.setAge(girl.getAge());
        //code 0 表示成功
        result.setCode(0);
        result.setMsg("成功");
        result.setData(girlRepository.save(girl));
        return result;
    }

    /**
     * @param
     * @return
     * @Description:通过id查询一个成员
     * @Date:
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * @param
     * @return
     * @Description:通过id更新一个成员信息
     * @Date:
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updatebyid(@PathVariable("id")  Integer id,@Valid Girl girl) {

        return girlRepository.save(girl);
    }

    /**
     * @param
     * @return
     * @Description:通过id删除一个成员
     * @Date:
     */
    @DeleteMapping(value = "/girls/{id}")
    public void delete(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }
}

