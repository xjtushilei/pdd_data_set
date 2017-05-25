# Patient Disease Drug Graph

### [中文介绍传送门-Chinese Introduction Portal](readme-zh.md)

This is the display project of the drug database. The use of spring-boot made url redirect, the front end of the use of thymeleaf as MVC model to pass the data receiver.

## Introduction to data set

The data set is rdf data set, on the physical therapy, which has a diagnosis, medication, etc., web online display only shows a part of the data, download the `nt` format data, you can get a `complete data set`.

Using these data sets, you can perform sparql queries, perform entity relationship identification, perform medical data mining, and so on.

So what is `important` is this data set ，not this project！

## Download

[Home page to konw how to download](http://kmap.xjtudlc.com/pdd/)

Server bandwidth is limited, it is recommended to Datahub download.


## This Project Technology

not data set

- spring-boot
- thymeleaf
- jquery

## Example

When you want to query out an entity, click directly to see what the entity is. E.g:


In [Patient-Disease-Drug Data Set](http://kmap.xjtudlc.com/pdd/dataset.html?tab=query&ds=/pdd)，Can be online inquiries, you can see the data as follows:


![数据集在线查询展示](/img/1.png)

When we click on one of the data,E.g:[http://kmap.xjtudlc.com/pdd_data/resource/145834](http://kmap.xjtudlc.com/pdd_data/resource/145834) , you can see what the current system shows:

![该系统展示](/img/2.png)


## Core code

```
    @GetMapping("/**/*")
    public String index(Model model , HttpServletRequest request) {
        String subject = String.valueOf(request.getRequestURL());
        model.addAttribute("subject",subject);
        return "/index";
    }
```

