package name.maxserebryanskiy.study.jackson.domain;

import java.util.List;

/**
 * Created by m on 02.05.2015.
 */
public class Resume {

    private String id;
    private String lastName;
    private Photo photo;
    //        "business_trip_readiness": {
//        "moderation_note": [
//        "travel_time": {
//    private List<Portfolio> portfolio;
//        "blocked": false,
//    private List<Certificate> certificate;
    private Area area;
    private Relocation relocation;
    private List<Employment> employment;
//        "employments": [
//        {
//            "id": "full",
//                "name": "Full time"
//        },
//        {
//            "id": "part",
//                "name": "Part time"
//        },
//        {
//            "id": "project",
//                "name": "Project work"
//        }
//        ],
//        "updated_at": "2015-04-23T14:11:06+0300",
//            "finished": true,
//            "schedules": [
//        {
//            "id": "fullDay",
//                "name": "Full time"
//        },
//        {
//            "id": "shift",
//                "name": "Shift schedule"
//        },
//        {
//            "id": "flexible",
//                "name": "Flexible schedule"
//        },
//        {
//            "id": "remote",
//                "name": "Remote working"
//        }
//        ],
//        "metro": {
//        "lat": 55.75098,
//                "lng": 37.78422,
//                "order": 2,
//                "id": "8.107",
//                "name": "Perovo"
//    },
//        "skills": "• Sociable, loyal, responsible, attentive. \r\n  • Knowledge of the principles of object-oriented programming, the basic theory of UML. \r\n  • Basic skills in programming C # .NET, Java, C ++ \r\n  • Basic skills in programming for Android OS \r\n  • Knowledge of techniques and testing processes. \r\n  • Knowledge of the principles of the networks \r\n  • Knowledge of HTML, CSS, JavaScript. \r\n  • Basic knowledge of MS SQL, Oracle. \r\n  • Excellent knowledge of the entire family of Windows. \r\n  • Experience with software of various kinds. \r\n  • Easy and quick to learn new knowledge. \r\n  • The rapid development of new software products. \r\n  • Independent study of programming languages. \r\n  • Experience with software products of 1C: Enterprise 8.2 (user-level and administrator) \r\n  • Knowledge of the architecture of modern computers.",
//            "gender": {
//        "id": "male",
//                "name": "Male"
//    },
//        "next_publish_at": "2015-04-23T18:11:06+0300",
//            "created_at": "2014-08-21T23:49:08+0400",
//            "_progress": {
//        "percentage": 83,
//                "mandatory": [],
//        "recommended": [
//        "portfolio",
//                "education",
//                "recommendation"
//        ]
//    },
//        "citizenship": [
//        {
//            "url": "https://api.hh.ru/areas/5",
//                "id": "5",
//                "name": "Ukraine"
//        }
//        ],
//        "resume_locale": {
//        "id": "EN",
//                "name": "English"
//    },
//        "new_views": 0,
//            "site": [
//        {
//            "url": "maxim.serebryanskiy",
//                "type": {
//            "id": "skype",
//                    "name": "Skype"
//        }
//        }
//        ],
//        "recommendation": [],
//        "alternate_url": "http://hh.ru/resume/1bf5122eff0213b3e90039ed1f484e36645778",
//            "education": {
//        "elementary": [],
//        "additional": [],
//        "attestation": [],
//        "primary": [
//        {
//            "organization_id": null,
//                "name_id": null,
//                "name": "Odessa National Sea University",
//                "year": 2010,
//                "organization": "Computer Science",
//                "result_id": null,
//                "result": "Software Engineer / Bachelor"
//        },
//        {
//            "organization_id": null,
//                "name_id": null,
//                "name": "Odessa College of Computer Technology \"Server\"",
//                "year": 2008,
//                "organization": "Programming for computer technology and automated systems.",
//                "result_id": null,
//                "result": "Software Engineer / Junior Specialist"
//        }
//        ],
//        "level": {
//            "id": "bachelor",
//                    "name": "Bachelor"
//        }
//    },
//        "employment": {
//        "id": "full",
//                "name": "Full time"
//    },
//        "id": "1bf5122eff0213b3e90039ed1f484e36645778",
//            "first_name": "Максим",
//            "middle_name": "Валериевич",
//            "specialization": [
//        {
//            "profarea_id": "1",
//                "profarea_name": "IT, Internet, Telecom",
//                "id": "1.221",
//                "name": "Software Development"
//        },
//        {
//            "profarea_id": "1",
//                "profarea_name": "IT, Internet, Telecom",
//                "id": "1.117",
//                "name": "Testing"
//        },
//        {
//            "profarea_id": "1",
//                "profarea_name": "IT, Internet, Telecom",
//                "id": "1.89",
//                "name": "Internet"
//        }
//        ],
//        "work_ticket": [
//        {
//            "url": "https://api.hh.ru/areas/5",
//                "id": "5",
//                "name": "Ukraine"
//        },
//        {
//            "url": "https://api.hh.ru/areas/113",
//                "id": "113",
//                "name": "Russia"
//        }
//        ],
//        "access": {
//        "blacklist": [
//        {
//            "url": "https://api.hh.ru/employers/58464",
//                "alternate_url": "http://hh.ru/employer/58464",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/58464"},
//            "id": "58464"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1016",
//                "alternate_url": "http://hh.ru/employer/1016",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1016"},
//            "id": "1016"
//        },
//        {
//            "url": "https://api.hh.ru/employers/536461",
//                "alternate_url": "http://hh.ru/employer/536461",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/536461"},
//            "id": "536461"
//        },
//        {
//            "url": "https://api.hh.ru/employers/684",
//                "alternate_url": "http://hh.ru/employer/684",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/684"},
//            "id": "684"
//        },
//        {
//            "url": "https://api.hh.ru/employers/38707",
//                "alternate_url": "http://hh.ru/employer/38707",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/38707"},
//            "id": "38707"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1034063",
//                "alternate_url": "http://hh.ru/employer/1034063",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1034063"},
//            "id": "1034063"
//        },
//        {
//            "url": "https://api.hh.ru/employers/83164",
//                "alternate_url": "http://hh.ru/employer/83164",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/83164"},
//            "id": "83164"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1060802",
//                "alternate_url": "http://hh.ru/employer/1060802",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1060802"},
//            "id": "1060802"
//        },
//        {
//            "url": "https://api.hh.ru/employers/414529",
//                "alternate_url": "http://hh.ru/employer/414529",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/414529"},
//            "id": "414529"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1063963",
//                "alternate_url": "http://hh.ru/employer/1063963",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1063963"},
//            "id": "1063963"
//        },
//        {
//            "url": "https://api.hh.ru/employers/678115",
//                "alternate_url": "http://hh.ru/employer/678115",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/678115"},
//            "id": "678115"
//        },
//        {
//            "url": "https://api.hh.ru/employers/126516",
//                "alternate_url": "http://hh.ru/employer/126516",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/126516"},
//            "id": "126516"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2419",
//                "alternate_url": "http://hh.ru/employer/2419",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2419"},
//            "id": "2419"
//        },
//        {
//            "url": "https://api.hh.ru/employers/536665",
//                "alternate_url": "http://hh.ru/employer/536665",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/536665"},
//            "id": "536665"
//        },
//        {
//            "url": "https://api.hh.ru/employers/21963",
//                "alternate_url": "http://hh.ru/employer/21963",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/21963"},
//            "id": "21963"
//        },
//        {
//            "url": "https://api.hh.ru/employers/103650",
//                "alternate_url": "http://hh.ru/employer/103650",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/103650"},
//            "id": "103650"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1495316",
//                "alternate_url": "http://hh.ru/employer/1495316",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1495316"},
//            "id": "1495316"
//        }
//        ],
//        "whitelist": [
//        {
//            "url": "https://api.hh.ru/employers/6815",
//                "alternate_url": "http://hh.ru/employer/6815",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/6815"},
//            "id": "6815"
//        },
//        {
//            "url": "https://api.hh.ru/employers/235922",
//                "alternate_url": "http://hh.ru/employer/235922",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/235922"},
//            "id": "235922"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2748",
//                "alternate_url": "http://hh.ru/employer/2748",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2748"},
//            "id": "2748"
//        },
//        {
//            "url": "https://api.hh.ru/employers/188646",
//                "alternate_url": "http://hh.ru/employer/188646",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/188646"},
//            "id": "188646"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2987",
//                "alternate_url": "http://hh.ru/employer/2987",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2987"},
//            "id": "2987"
//        },
//        {
//            "url": "https://api.hh.ru/employers/544808",
//                "alternate_url": "http://hh.ru/employer/544808",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/544808"},
//            "id": "544808"
//        },
//        {
//            "url": "https://api.hh.ru/employers/746069",
//                "alternate_url": "http://hh.ru/employer/746069",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/746069"},
//            "id": "746069"
//        },
//        {
//            "url": "https://api.hh.ru/employers/896612",
//                "alternate_url": "http://hh.ru/employer/896612",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/896612"},
//            "id": "896612"
//        },
//        {
//            "url": "https://api.hh.ru/employers/22494",
//                "alternate_url": "http://hh.ru/employer/22494",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/22494"},
//            "id": "22494"
//        },
//        {
//            "url": "https://api.hh.ru/employers/66645",
//                "alternate_url": "http://hh.ru/employer/66645",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/66645"},
//            "id": "66645"
//        },
//        {
//            "url": "https://api.hh.ru/employers/214266",
//                "alternate_url": "http://hh.ru/employer/214266",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/214266"},
//            "id": "214266"
//        },
//        {
//            "url": "https://api.hh.ru/employers/70771",
//                "alternate_url": "http://hh.ru/employer/70771",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/70771"},
//            "id": "70771"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1141611",
//                "alternate_url": "http://hh.ru/employer/1141611",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1141611"},
//            "id": "1141611"
//        },
//        {
//            "url": "https://api.hh.ru/employers/38007",
//                "alternate_url": "http://hh.ru/employer/38007",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/38007"},
//            "id": "38007"
//        },
//        {
//            "url": "https://api.hh.ru/employers/259",
//                "alternate_url": "http://hh.ru/employer/259",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/259"},
//            "id": "259"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1215983",
//                "alternate_url": "http://hh.ru/employer/1215983",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1215983"},
//            "id": "1215983"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1301844",
//                "alternate_url": "http://hh.ru/employer/1301844",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1301844"},
//            "id": "1301844"
//        },
//        {
//            "url": "https://api.hh.ru/employers/223129",
//                "alternate_url": "http://hh.ru/employer/223129",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/223129"},
//            "id": "223129"
//        },
//        {
//            "url": "https://api.hh.ru/employers/680293",
//                "alternate_url": "http://hh.ru/employer/680293",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/680293"},
//            "id": "680293"
//        },
//        {
//            "url": "https://api.hh.ru/employers/22842",
//                "alternate_url": "http://hh.ru/employer/22842",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/22842"},
//            "id": "22842"
//        },
//        {
//            "url": "https://api.hh.ru/employers/899854",
//                "alternate_url": "http://hh.ru/employer/899854",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/899854"},
//            "id": "899854"
//        },
//        {
//            "url": "https://api.hh.ru/employers/143735",
//                "alternate_url": "http://hh.ru/employer/143735",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/143735"},
//            "id": "143735"
//        },
//        {
//            "url": "https://api.hh.ru/employers/864086",
//                "alternate_url": "http://hh.ru/employer/864086",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/864086"},
//            "id": "864086"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2238",
//                "alternate_url": "http://hh.ru/employer/2238",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2238"},
//            "id": "2238"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2954",
//                "alternate_url": "http://hh.ru/employer/2954",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2954"},
//            "id": "2954"
//        },
//        {
//            "url": "https://api.hh.ru/employers/6004",
//                "alternate_url": "http://hh.ru/employer/6004",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/6004"},
//            "id": "6004"
//        },
//        {
//            "url": "https://api.hh.ru/employers/521",
//                "alternate_url": "http://hh.ru/employer/521",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/521"},
//            "id": "521"
//        },
//        {
//            "url": "https://api.hh.ru/employers/985699",
//                "alternate_url": "http://hh.ru/employer/985699",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/985699"},
//            "id": "985699"
//        },
//        {
//            "url": "https://api.hh.ru/employers/3778",
//                "alternate_url": "http://hh.ru/employer/3778",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/3778"},
//            "id": "3778"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1257474",
//                "alternate_url": "http://hh.ru/employer/1257474",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1257474"},
//            "id": "1257474"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1304",
//                "alternate_url": "http://hh.ru/employer/1304",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1304"},
//            "id": "1304"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2800",
//                "alternate_url": "http://hh.ru/employer/2800",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2800"},
//            "id": "2800"
//        },
//        {
//            "url": "https://api.hh.ru/employers/199361",
//                "alternate_url": "http://hh.ru/employer/199361",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/199361"},
//            "id": "199361"
//        },
//        {
//            "url": "https://api.hh.ru/employers/5429",
//                "alternate_url": "http://hh.ru/employer/5429",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/5429"},
//            "id": "5429"
//        },
//        {
//            "url": "https://api.hh.ru/employers/9849",
//                "alternate_url": "http://hh.ru/employer/9849",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/9849"},
//            "id": "9849"
//        },
//        {
//            "url": "https://api.hh.ru/employers/866666",
//                "alternate_url": "http://hh.ru/employer/866666",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/866666"},
//            "id": "866666"
//        },
//        {
//            "url": "https://api.hh.ru/employers/15589",
//                "alternate_url": "http://hh.ru/employer/15589",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/15589"},
//            "id": "15589"
//        },
//        {
//            "url": "https://api.hh.ru/employers/26624",
//                "alternate_url": "http://hh.ru/employer/26624",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/26624"},
//            "id": "26624"
//        },
//        {
//            "url": "https://api.hh.ru/employers/6376",
//                "alternate_url": "http://hh.ru/employer/6376",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/6376"},
//            "id": "6376"
//        },
//        {
//            "url": "https://api.hh.ru/employers/622296",
//                "alternate_url": "http://hh.ru/employer/622296",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/622296"},
//            "id": "622296"
//        },
//        {
//            "url": "https://api.hh.ru/employers/37699",
//                "alternate_url": "http://hh.ru/employer/37699",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/37699"},
//            "id": "37699"
//        },
//        {
//            "url": "https://api.hh.ru/employers/142231",
//                "alternate_url": "http://hh.ru/employer/142231",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/142231"},
//            "id": "142231"
//        },
//        {
//            "url": "https://api.hh.ru/employers/630914",
//                "alternate_url": "http://hh.ru/employer/630914",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/630914"},
//            "id": "630914"
//        },
//        {
//            "url": "https://api.hh.ru/employers/4943",
//                "alternate_url": "http://hh.ru/employer/4943",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/4943"},
//            "id": "4943"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1133840",
//                "alternate_url": "http://hh.ru/employer/1133840",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1133840"},
//            "id": "1133840"
//        },
//        {
//            "url": "https://api.hh.ru/employers/42080",
//                "alternate_url": "http://hh.ru/employer/42080",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/42080"},
//            "id": "42080"
//        },
//        {
//            "url": "https://api.hh.ru/employers/5135",
//                "alternate_url": "http://hh.ru/employer/5135",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/5135"},
//            "id": "5135"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1068",
//                "alternate_url": "http://hh.ru/employer/1068",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1068"},
//            "id": "1068"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1116875",
//                "alternate_url": "http://hh.ru/employer/1116875",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1116875"},
//            "id": "1116875"
//        },
//        {
//            "url": "https://api.hh.ru/employers/115",
//                "alternate_url": "http://hh.ru/employer/115",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/115"},
//            "id": "115"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2765",
//                "alternate_url": "http://hh.ru/employer/2765",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2765"},
//            "id": "2765"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1229809",
//                "alternate_url": "http://hh.ru/employer/1229809",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1229809"},
//            "id": "1229809"
//        },
//        {
//            "url": "https://api.hh.ru/employers/684561",
//                "alternate_url": "http://hh.ru/employer/684561",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/684561"},
//            "id": "684561"
//        },
//        {
//            "url": "https://api.hh.ru/employers/32087",
//                "alternate_url": "http://hh.ru/employer/32087",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/32087"},
//            "id": "32087"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1107651",
//                "alternate_url": "http://hh.ru/employer/1107651",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1107651"},
//            "id": "1107651"
//        },
//        {
//            "url": "https://api.hh.ru/employers/726103",
//                "alternate_url": "http://hh.ru/employer/726103",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/726103"},
//            "id": "726103"
//        },
//        {
//            "url": "https://api.hh.ru/employers/853253",
//                "alternate_url": "http://hh.ru/employer/853253",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/853253"},
//            "id": "853253"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1417893",
//                "alternate_url": "http://hh.ru/employer/1417893",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1417893"},
//            "id": "1417893"
//        },
//        {
//            "url": "https://api.hh.ru/employers/11834",
//                "alternate_url": "http://hh.ru/employer/11834",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/11834"},
//            "id": "11834"
//        },
//        {
//            "url": "https://api.hh.ru/employers/34531",
//                "alternate_url": "http://hh.ru/employer/34531",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/34531"},
//            "id": "34531"
//        },
//        {
//            "url": "https://api.hh.ru/employers/23185",
//                "alternate_url": "http://hh.ru/employer/23185",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/23185"},
//            "id": "23185"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1069834",
//                "alternate_url": "http://hh.ru/employer/1069834",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1069834"},
//            "id": "1069834"
//        },
//        {
//            "url": "https://api.hh.ru/employers/702",
//                "alternate_url": "http://hh.ru/employer/702",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/702"},
//            "id": "702"
//        },
//        {
//            "url": "https://api.hh.ru/employers/735444",
//                "alternate_url": "http://hh.ru/employer/735444",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/735444"},
//            "id": "735444"
//        },
//        {
//            "url": "https://api.hh.ru/employers/681624",
//                "alternate_url": "http://hh.ru/employer/681624",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/681624"},
//            "id": "681624"
//        },
//        {
//            "url": "https://api.hh.ru/employers/727185",
//                "alternate_url": "http://hh.ru/employer/727185",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/727185"},
//            "id": "727185"
//        },
//        {
//            "url": "https://api.hh.ru/employers/27645",
//                "alternate_url": "http://hh.ru/employer/27645",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/27645"},
//            "id": "27645"
//        },
//        {
//            "url": "https://api.hh.ru/employers/397",
//                "alternate_url": "http://hh.ru/employer/397",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/397"},
//            "id": "397"
//        },
//        {
//            "url": "https://api.hh.ru/employers/32918",
//                "alternate_url": "http://hh.ru/employer/32918",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/32918"},
//            "id": "32918"
//        },
//        {
//            "url": "https://api.hh.ru/employers/15664",
//                "alternate_url": "http://hh.ru/employer/15664",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/15664"},
//            "id": "15664"
//        },
//        {
//            "url": "https://api.hh.ru/employers/4758",
//                "alternate_url": "http://hh.ru/employer/4758",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/4758"},
//            "id": "4758"
//        },
//        {
//            "url": "https://api.hh.ru/employers/169984",
//                "alternate_url": "http://hh.ru/employer/169984",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/169984"},
//            "id": "169984"
//        },
//        {
//            "url": "https://api.hh.ru/employers/6189",
//                "alternate_url": "http://hh.ru/employer/6189",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/6189"},
//            "id": "6189"
//        },
//        {
//            "url": "https://api.hh.ru/employers/21022",
//                "alternate_url": "http://hh.ru/employer/21022",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/21022"},
//            "id": "21022"
//        },
//        {
//            "url": "https://api.hh.ru/employers/9188",
//                "alternate_url": "http://hh.ru/employer/9188",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/9188"},
//            "id": "9188"
//        },
//        {
//            "url": "https://api.hh.ru/employers/118747",
//                "alternate_url": "http://hh.ru/employer/118747",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/118747"},
//            "id": "118747"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1111058",
//                "alternate_url": "http://hh.ru/employer/1111058",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1111058"},
//            "id": "1111058"
//        },
//        {
//            "url": "https://api.hh.ru/employers/5599",
//                "alternate_url": "http://hh.ru/employer/5599",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/5599"},
//            "id": "5599"
//        },
//        {
//            "url": "https://api.hh.ru/employers/5325",
//                "alternate_url": "http://hh.ru/employer/5325",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/5325"},
//            "id": "5325"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1045999",
//                "alternate_url": "http://hh.ru/employer/1045999",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1045999"},
//            "id": "1045999"
//        },
//        {
//            "url": "https://api.hh.ru/employers/148287",
//                "alternate_url": "http://hh.ru/employer/148287",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/148287"},
//            "id": "148287"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1740",
//                "alternate_url": "http://hh.ru/employer/1740",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1740"},
//            "id": "1740"
//        },
//        {
//            "url": "https://api.hh.ru/employers/813110",
//                "alternate_url": "http://hh.ru/employer/813110",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/813110"},
//            "id": "813110"
//        },
//        {
//            "url": "https://api.hh.ru/employers/247118",
//                "alternate_url": "http://hh.ru/employer/247118",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/247118"},
//            "id": "247118"
//        },
//        {
//            "url": "https://api.hh.ru/employers/822237",
//                "alternate_url": "http://hh.ru/employer/822237",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/822237"},
//            "id": "822237"
//        },
//        {
//            "url": "https://api.hh.ru/employers/429",
//                "alternate_url": "http://hh.ru/employer/429",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/429"},
//            "id": "429"
//        },
//        {
//            "url": "https://api.hh.ru/employers/416",
//                "alternate_url": "http://hh.ru/employer/416",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/416"},
//            "id": "416"
//        },
//        {
//            "url": "https://api.hh.ru/employers/660225",
//                "alternate_url": "http://hh.ru/employer/660225",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/660225"},
//            "id": "660225"
//        },
//        {
//            "url": "https://api.hh.ru/employers/470",
//                "alternate_url": "http://hh.ru/employer/470",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/470"},
//            "id": "470"
//        },
//        {
//            "url": "https://api.hh.ru/employers/654435",
//                "alternate_url": "http://hh.ru/employer/654435",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/654435"},
//            "id": "654435"
//        },
//        {
//            "url": "https://api.hh.ru/employers/13820",
//                "alternate_url": "http://hh.ru/employer/13820",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/13820"},
//            "id": "13820"
//        },
//        {
//            "url": "https://api.hh.ru/employers/3095",
//                "alternate_url": "http://hh.ru/employer/3095",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/3095"},
//            "id": "3095"
//        },
//        {
//            "url": "https://api.hh.ru/employers/52213",
//                "alternate_url": "http://hh.ru/employer/52213",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/52213"},
//            "id": "52213"
//        },
//        {
//            "url": "https://api.hh.ru/employers/461",
//                "alternate_url": "http://hh.ru/employer/461",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/461"},
//            "id": "461"
//        },
//        {
//            "url": "https://api.hh.ru/employers/22044",
//                "alternate_url": "http://hh.ru/employer/22044",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/22044"},
//            "id": "22044"
//        },
//        {
//            "url": "https://api.hh.ru/employers/998130",
//                "alternate_url": "http://hh.ru/employer/998130",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/998130"},
//            "id": "998130"
//        },
//        {
//            "url": "https://api.hh.ru/employers/154761",
//                "alternate_url": "http://hh.ru/employer/154761",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/154761"},
//            "id": "154761"
//        },
//        {
//            "url": "https://api.hh.ru/employers/572335",
//                "alternate_url": "http://hh.ru/employer/572335",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/572335"},
//            "id": "572335"
//        },
//        {
//            "url": "https://api.hh.ru/employers/769731",
//                "alternate_url": "http://hh.ru/employer/769731",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/769731"},
//            "id": "769731"
//        },
//        {
//            "url": "https://api.hh.ru/employers/505",
//                "alternate_url": "http://hh.ru/employer/505",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/505"},
//            "id": "505"
//        },
//        {
//            "url": "https://api.hh.ru/employers/216742",
//                "alternate_url": "http://hh.ru/employer/216742",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/216742"},
//            "id": "216742"
//        },
//        {
//            "url": "https://api.hh.ru/employers/560786",
//                "alternate_url": "http://hh.ru/employer/560786",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/560786"},
//            "id": "560786"
//        },
//        {
//            "url": "https://api.hh.ru/employers/44877",
//                "alternate_url": "http://hh.ru/employer/44877",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/44877"},
//            "id": "44877"
//        },
//        {
//            "url": "https://api.hh.ru/employers/6753",
//                "alternate_url": "http://hh.ru/employer/6753",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/6753"},
//            "id": "6753"
//        },
//        {
//            "url": "https://api.hh.ru/employers/2631",
//                "alternate_url": "http://hh.ru/employer/2631",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/2631"},
//            "id": "2631"
//        },
//        {
//            "url": "https://api.hh.ru/employers/38578",
//                "alternate_url": "http://hh.ru/employer/38578",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/38578"},
//            "id": "38578"
//        },
//        {
//            "url": "https://api.hh.ru/employers/36361",
//                "alternate_url": "http://hh.ru/employer/36361",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/36361"},
//            "id": "36361"
//        },
//        {
//            "url": "https://api.hh.ru/employers/1455",
//                "alternate_url": "http://hh.ru/employer/1455",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/1455"},
//            "id": "1455"
//        },
//        {
//            "url": "https://api.hh.ru/employers/712197",
//                "alternate_url": "http://hh.ru/employer/712197",
//                "logo_urls": {"90": "http://hh.ru/employer/logo/712197"},
//            "id": "712197"
//        }
//        ],
//        "type": {
//            "id": "direct",
//                    "name": "available only by direct link"
//        }
//    },
//        "status": {
//        "id": "published",
//                "name": "published"
//    },
//        "schedule": {
//        "id": "fullDay",
//                "name": "Full time"
//    },
//        "total_views": 140,
//            "skill_set": [
//        "C#",
//                "Java",
//                "Load Testing"
//        ],
//        "salary": {
//        "currency": "USD",
//                "amount": 3000
//    },
//        "language": [
//        {
//            "level": {
//            "id": "can_read",
//                    "name": "I read professional literature"
//        },
//            "id": "eng",
//                "name": "English"
//        },
//        {
//            "level": {
//            "id": "native",
//                    "name": "native"
//        },
//            "id": "rus",
//                "name": "Russian"
//        },
//        {
//            "level": {
//            "id": "can_pass_interview",
//                    "name": "I can attend an interview"
//        },
//            "id": "ukr",
//                "name": "Ukrainian"
//        }
//        ],
//        "age": 26,
//            "title": "QA automation engineer / Developer Java / Autotester",
//            "experience": [
//        {
//            "industries": [
//            {
//                "id": "7.540",
//                    "name": "Software Development"
//            },
//            {
//                "id": "7.539",
//                    "name": "System Integration, Technological and Business Processes Automation, IT Consulting"
//            },
//            {
//                "id": "43.648",
//                    "name": "Managing, Investment Company (Asset Management)"
//            },
//            {
//                "id": "7.541",
//                    "name": "Internet Company (Search Engines, Payment Systems, Social Networks, Information and Educational, Entertainment Resources, Website Promotion etc.)"
//            }
//            ],
//            "end": null,
//                "description": "Responsibilities: \r\n  • Research the requirements and the documentation of the project. \r\n  • Develop scripts for automated testing. \r\n  • Develop test scenarios. \r\n  • Preparation of test data. \r\n  • Conduct functional and regression testing of information systems. \r\n  • Reporting of launches automated tests. \r\n  • Analysis and localization of defects found. \r\n  • Check out the site to the customer. \r\nAchievements \r\n  • Experience automatized testing WEB-applications. \r\n  • Experience with Selenium / WebDriver (Java), \r\n  • Experience with framework TestNG, \r\n  • Experience with continuous integration Jenkins. \r\n  • Experience with Maven. \r\n  • Experience deploying stands to run automated tests with Windows and Linux.",
//                "area": {
//            "url": "https://api.hh.ru/areas/1",
//                    "id": "1",
//                    "name": "Moscow"
//        },
//            "company_url": "http://group.r-style.ru",
//                "industry": null,
//                "company_id": "684",
//                "employer": {
//            "url": "https://api.hh.ru/employers/684",
//                    "alternate_url": "http://hh.ru/employer/684",
//                    "logo_urls": {"90": "http://hh.ru/employer/logo/684"},
//            "id": "684",
//                    "name": "R-Style Group"
//        },
//            "start": "2014-01-01",
//                "position": "QA Engineer",
//                "company": "R-Style Group"
//        },
//        {
//            "industries": [
//            {
//                "id": "7.539",
//                    "name": "System Integration, Technological and Business Processes Automation, IT Consulting"
//            }
//            ],
//            "end": "2014-01-01",
//                "description": "Responsibilities: \r\n  • Research with the requirements and the documentation of the project. \r\n  • Develop scripts for load testing. \r\n  • Preparation of test data. \r\n  • Monitoring servers. \r\n  • Reporting on the work on load testing. \r\n  • Analysis of defects found during load testing. \r\nAchievements \r\n  • Experience in load testing WEB-applications; \r\n  • Experience with the software package HP LoadRunner,\r\n  • Experience with tool for load testing jMeter \r\n  • Experience in collecting statistics Windows- and Unix-based Servers \r\n  • Experience in writing Job and procedures in Oracle DB",
//                "area": {
//            "url": "https://api.hh.ru/areas/1",
//                    "id": "1",
//                    "name": "Moscow"
//        },
//            "company_url": "http://www.sntru.com",
//                "industry": null,
//                "company_id": "4693",
//                "employer": {
//            "url": "https://api.hh.ru/employers/4693",
//                    "alternate_url": "http://hh.ru/employer/4693",
//                    "logo_urls": {"90": "http://hh.ru/employer/logo/4693"},
//            "id": "4693",
//                    "name": "S&T International"
//        },
//            "start": "2012-10-01",
//                "position": "QA Engineer / Load testing",
//                "company": "S&T International"
//        },
//        {
//            "industries": [
//            {
//                "id": "7.539",
//                    "name": "System Integration, Technological and Business Processes Automation, IT Consulting"
//            }
//            ],
//            "end": "2012-10-01",
//                "description": "Responsibilities: \r\n  • Research with the requirements and the documentation of the project. \r\n  • Develop tests.\r\n  • Preparation of test data. \r\n  • Performance of different types of testing information systems. \r\n  • Manual functional testing of business logic applications. \r\n  • Regression testing. \r\n  • Reporting on the work of testing - testing progress and status of defects. \r\n  • Analysis of the defects found by the testers and the customer. \r\nAchievements \r\n  • Experience in testing WEB-applications; \r\n  • Experience with defect management systems (Microsoft Test Manager), with the software package HP LoadRunner, virtual machines VMWare, the program Remote Desktop Microsoft Terminal Server Client",
//                "area": {
//            "url": "https://api.hh.ru/areas/1",
//                    "id": "1",
//                    "name": "Moscow"
//        },
//            "company_url": "http://www.sntru.com",
//                "industry": null,
//                "company_id": "4693",
//                "employer": {
//            "url": "https://api.hh.ru/employers/4693",
//                    "alternate_url": "http://hh.ru/employer/4693",
//                    "logo_urls": {"90": "http://hh.ru/employer/logo/4693"},
//            "id": "4693",
//                    "name": "S&T International"
//        },
//            "start": "2012-07-01",
//                "position": "QA Engineer",
//                "company": "S&T International"
//        },
//        {
//            "industries": [],
//            "end": "2011-10-01",
//                "description": "Responsibilities: \r\n  • Contextual advertising hotels in the search engines Google and Yandex \r\n  • Maintenance of computer equipment \r\n  • control of miniATS \r\n  • server settings based on the OS Windows XP \r\nAchievements: \r\n  • set the telephone network with 50 rooms \r\n  • set the Wi-Fi network with the layout of hotel and restaurant at the lowest cost",
//                "area": {
//            "url": "https://api.hh.ru/areas/127",
//                    "id": "127",
//                    "name": "Odessa"
//        },
//            "company_url": "http://",
//                "industry": null,
//                "company_id": null,
//                "employer": null,
//                "start": "2011-04-01",
//                "position": "System administrator",
//                "company": "Hotel"
//        },
//        {
//            "industries": [
//            {
//                "id": "39.442",
//                    "name": "Higher Education Institution, Secondary Specialized College, College, Vocational School"
//            }
//            ],
//            "end": "2007-05-01",
//                "description": "Responsibilities: \r\n  • Training school students rate \"System Administrator\".\r\n  • Reporting. \r\nAchievements: \r\n  • learn to plan their working hours.\r\n  • Got experience working with groups of children of 6-10 people.",
//                "area": {
//            "url": "https://api.hh.ru/areas/127",
//                    "id": "127",
//                    "name": "Odessa"
//        },
//            "company_url": "http://server.odessa.ua",
//                "industry": null,
//                "company_id": null,
//                "employer": null,
//                "start": "2006-09-01",
//                "position": "Teacher",
//                "company": "Odessa College of Computer Technology \"Server\""
//        }
//        ],
//        "views_url": "https://api.hh.ru/resumes/1bf5122eff0213b3e90039ed1f484e36645778/views",
//            "contact": [
//        {
//            "comment": null,
//                "type": {
//            "id": "cell",
//                    "name": "Cellphone"
//        },
//            "preferred": false,
//                "value": {
//            "country": "380",
//                    "number": "3900100",
//                    "city": "63"
//        }
//        },
//        {
//            "comment": null,
//                "type": {
//            "id": "work",
//                    "name": "Work phone"
//        },
//            "preferred": true,
//                "value": {
//            "country": "7",
//                    "number": "1624254",
//                    "city": "925"
//        }
//        },
//        {
//            "type": {
//            "id": "email",
//                    "name": "Email"
//        },
//            "preferred": false,
//                "value": "maxim.serebryanskiy@live.ru"
//        }
//        ],
//        "birth_date": "1989-02-17"
//    }
}
