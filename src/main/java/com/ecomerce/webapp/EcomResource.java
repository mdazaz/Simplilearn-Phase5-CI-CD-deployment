package com.ecomerce.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomResource {
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue="World") String name) {
		return "<h1>Today is a wonderfull day ahead ! , " + name +"</h1>";
	}
	
	@GetMapping("/")
	public String index() {
		return "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'><main role='main' class='container'>
      <div class='d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow'>
        <img class='mr-3' src='https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-outline.svg' alt='' width='48' height='48'>
        <div class='lh-100'>
          <h6 class='mb-0 text-white lh-100'>eCommerce Web Application Deployed using Jenkins </h6>
          <small>Since 2011</small>
        </div>
      </div>

      <div class='my-3 p-3 bg-white rounded box-shadow'>
        <h6 class='border-bottom border-gray pb-2 mb-0'>Recent updates</h6>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb15364%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb15364%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <p class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <strong class='d-block text-gray-dark'>@Mohammad Azaz</strong>
            This is jenkins web application deployed using jenkins , aws, docker, maven pull code from github  developer Mohammad Azaz.
          </p>
        </div>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=e83e8c&amp;fg=e83e8c&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb15367%20text%20%7B%20fill%3A%23e83e8c%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb15367%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23e83e8c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <p class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <strong class='d-block text-gray-dark'>@username</strong>
            This is jenkins web application deployed using jenkins , aws, docker, maven pull code from github  developer Mohammad Azaz.
          </p>
        </div>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=6f42c1&amp;fg=6f42c1&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb1536a%20text%20%7B%20fill%3A%236f42c1%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb1536a%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%236f42c1%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <p class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <strong class='d-block text-gray-dark'>@username</strong>
            This is jenkins web application deployed using jenkins , aws, docker, maven pull code from github  developer Mohammad Azaz.
          </p>
        </div>
        <small class='d-block text-right mt-3'>
          <a href='#'>All updates</a>
        </small>
      </div>

      <div class='my-3 p-3 bg-white rounded box-shadow'>
        <h6 class='border-bottom border-gray pb-2 mb-0'>Suggestions</h6>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb1536b%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb1536b%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <div class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <div class='d-flex justify-content-between align-items-center w-100'>
              <strong class='text-gray-dark'>Full Name</strong>
              <a href='#'>Follow</a>
            </div>
            <span class='d-block'>@username</span>
          </div>
        </div>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb1536c%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb1536c%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <div class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <div class='d-flex justify-content-between align-items-center w-100'>
              <strong class='text-gray-dark'>Full Name</strong>
              <a href='#'>Follow</a>
            </div>
            <span class='d-block'>@username</span>
          </div>
        </div>
        <div class='media text-muted pt-3'>
          <img data-src='holder.js/32x32?theme=thumb&amp;bg=007bff&amp;fg=007bff&amp;size=1' alt='32x32' class='mr-2 rounded' style='width: 32px; height: 32px;' src='data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_17e2bb1536d%20text%20%7B%20fill%3A%23007bff%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_17e2bb1536d%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23007bff%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2211.836840629577637%22%20y%3D%2216.960000014305116%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E' data-holder-rendered='true'>
          <div class='media-body pb-3 mb-0 small lh-125 border-bottom border-gray'>
            <div class='d-flex justify-content-between align-items-center w-100'>
              <strong class='text-gray-dark'>Full Name</strong>
              <a href='#'>Follow</a>
            </div>
            <span class='d-block'>@username</span>
          </div>
        </div>
        <small class='d-block text-right mt-3'>
          <a href='#'>All suggestions</a>
        </small>
      </div>
    </main>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "<h2>Hello, wonderfull job!<h2>";
	}
}
