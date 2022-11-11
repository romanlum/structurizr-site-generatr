package nl.avisi.structurizr.site.generatr.site.views

import kotlinx.html.HTML
import nl.avisi.structurizr.site.generatr.site.model.SoftwareSystemDecisionPageViewModel

fun HTML.softwareSystemDecisionPage(viewModel: SoftwareSystemDecisionPageViewModel) {
    softwareSystemPage(viewModel) {
        markdown(viewModel, viewModel.content)
    }
}
