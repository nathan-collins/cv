var markdownpdf = require("markdown-pdf"),
  fs = require("fs");

markdownpdf()
  .from("./README.md")
  .to("./nathancollins.pdf", function () {
    console.log("Done");
  });
