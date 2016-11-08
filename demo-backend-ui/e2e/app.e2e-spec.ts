import { DemoBackendUiPage } from './app.po';

describe('demo-backend-ui App', function() {
  let page: DemoBackendUiPage;

  beforeEach(() => {
    page = new DemoBackendUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
